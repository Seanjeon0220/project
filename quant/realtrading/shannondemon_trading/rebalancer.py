# ============================================
# 리밸런싱 로직 (수수료 반영 버전)
# ============================================

from kis_api import KISApi
from config import (
    TICKER, STOCK_RATIO, MIN_TRADE_AMOUNT,
    TOTAL_BUY_COST, TOTAL_SELL_COST
)


class Rebalancer:
    def __init__(self):
        self.api = KISApi()
    
    def calculate_trade_amount(self, cash, stock_value):
        """
        수수료를 고려하여 정확히 50/50이 되는 거래 금액 계산
        
        Returns:
            (action, amount): ('BUY', 금액) 또는 ('SELL', 금액) 또는 ('HOLD', 0)
        """
        diff = cash - stock_value
        
        if abs(diff) < MIN_TRADE_AMOUNT * 2:
            # 차이가 너무 작으면 거래 불필요
            return ('HOLD', 0)
        
        if diff > 0:
            # 현금 > 주식 → 매수 필요
            # 거래 후: cash - X*(1+fee) = stock + X
            # X = (cash - stock) / (2 + fee)
            amount = diff / (2 + TOTAL_BUY_COST)
            return ('BUY', amount)
        else:
            # 주식 > 현금 → 매도 필요
            # 거래 후: cash + X*(1-fee) = stock - X
            # X = (stock - cash) / (2 - fee)
            amount = abs(diff) / (2 - TOTAL_SELL_COST)
            return ('SELL', amount)
    
    def run(self):
        """리밸런싱 실행"""
        print("\n" + "=" * 50)
        print(" Shannon's Demon - Rebalancing")
        print("=" * 50)
        
        # 1. 인증
        if not self.api.authenticate():
            return {"success": False, "message": "인증 실패"}
        
        # 2. 현재 잔고 조회
        balance_data = self.api.get_balance()
        balance = self.api.parse_balance(balance_data)
        
        if not balance:
            return {"success": False, "message": "잔고 조회 실패"}
        
        cash = balance["cash"]
        stock_value = balance["stock_value"]
        stock_qty = balance["stock_quantity"]
        total = balance["total"]
        
        current_ratio = stock_value / total if total > 0 else 0
        
        print(f"\n[현재 상태]")
        print(f"  현금: {cash:,}원")
        print(f"  주식: {stock_value:,}원 ({stock_qty}주)")
        print(f"  총자산: {total:,}원")
        print(f"  주식비율: {current_ratio*100:.2f}%")
        
        # 3. 수수료 고려한 거래 금액 계산
        action, trade_amount = self.calculate_trade_amount(cash, stock_value)
        
        print(f"\n[리밸런싱 분석]")
        print(f"  현금-주식 차이: {cash - stock_value:+,}원")
        print(f"  필요 조치: {action}")
        
        if action == 'HOLD':
            print(f"\n[결과] 리밸런싱 불필요 (균형 상태)")
            return {
                "success": True,
                "action": "HOLD",
                "message": "리밸런싱 불필요"
            }
        
        # 4. 현재가 조회
        current_price = self.api.get_current_price(TICKER)
        if not current_price:
            return {"success": False, "message": "현재가 조회 실패"}
        
        print(f"  현재가: {current_price:,}원")
        print(f"  거래 금액: {trade_amount:,.0f}원")
        
        # 5. 주문 수량 계산
        quantity = int(trade_amount / current_price)
        
        if quantity == 0:
            print(f"\n[결과] 주문 수량 0 - 리밸런싱 불필요")
            return {
                "success": True,
                "action": "HOLD",
                "message": "주문 수량 0"
            }
        
        # 6. 거래 후 예상 상태 계산
        if action == 'BUY':
            actual_trade = quantity * current_price
            fee = actual_trade * TOTAL_BUY_COST
            expected_cash = cash - actual_trade - fee
            expected_stock = stock_value + actual_trade
        else:
            actual_trade = quantity * current_price
            fee = actual_trade * TOTAL_SELL_COST
            expected_cash = cash + actual_trade - fee
            expected_stock = stock_value - actual_trade
        
        expected_total = expected_cash + expected_stock
        expected_ratio = expected_stock / expected_total if expected_total > 0 else 0
        
        print(f"\n[거래 후 예상]")
        print(f"  예상 현금: {expected_cash:,.0f}원")
        print(f"  예상 주식: {expected_stock:,.0f}원")
        print(f"  예상 비율: {expected_ratio*100:.2f}%")
        print(f"  예상 수수료: {fee:,.0f}원")
        
        # 7. 주문 실행
        if action == 'BUY':
            print(f"\n[실행] 매수: {TICKER} {quantity}주")
            result = self.api.buy_stock(TICKER, quantity)
        else:
            print(f"\n[실행] 매도: {TICKER} {quantity}주")
            result = self.api.sell_stock(TICKER, quantity)
        
        if result:
            print(f"[결과] 주문 성공!")
            return {
                "success": True,
                "action": action,
                "quantity": quantity,
                "price": current_price,
                "fee": fee,
                "expected_ratio": expected_ratio,
                "message": f"{action} {quantity}주 완료"
            }
        else:
            return {
                "success": False,
                "action": action,
                "message": "주문 실패"
            }
    
    def get_status(self):
        """현재 상태만 조회 (거래 없음)"""
        if not self.api.authenticate():
            return None
        
        balance_data = self.api.get_balance()
        balance = self.api.parse_balance(balance_data)
        
        if balance:
            balance["stock_ratio"] = balance["stock_value"] / balance["total"] if balance["total"] > 0 else 0
            balance["cash_ratio"] = balance["cash"] / balance["total"] if balance["total"] > 0 else 0
            balance["target_ratio"] = STOCK_RATIO
            balance["imbalance"] = abs(balance["stock_ratio"] - STOCK_RATIO)
        
        return balance


if __name__ == "__main__":
    # 테스트 실행
    rebalancer = Rebalancer()
    result = rebalancer.run()
    print(f"\n최종 결과: {result}")