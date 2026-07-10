# ============================================
# KIS API 연동 모듈
# ============================================

import requests
import json
from datetime import datetime
from config import (
    KIS_APP_KEY, KIS_APP_SECRET, KIS_ACCOUNT_NO,
    KIS_BASE_URL, KIS_MOCK, TICKER
)

class KISApi:
    def __init__(self):
        self.base_url = KIS_BASE_URL
        self.app_key = KIS_APP_KEY
        self.app_secret = KIS_APP_SECRET
        self.account_no = KIS_ACCOUNT_NO.split("-")[0]
        self.account_cd = KIS_ACCOUNT_NO.split("-")[1]
        self.access_token = None
        self.token_expired = None
    
    def _get_headers(self, tr_id):
        """API 요청 헤더 생성"""
        return {
            "Content-Type": "application/json; charset=utf-8",
            "authorization": f"Bearer {self.access_token}",
            "appkey": self.app_key,
            "appsecret": self.app_secret,
            "tr_id": tr_id,
        }
    
    def authenticate(self):
        """OAuth 토큰 발급"""
        url = f"{self.base_url}/oauth2/tokenP"
        body = {
            "grant_type": "client_credentials",
            "appkey": self.app_key,
            "appsecret": self.app_secret
        }
        
        res = requests.post(url, json=body)
        if res.status_code == 200:
            data = res.json()
            self.access_token = data["access_token"]
            self.token_expired = datetime.now()
            print(f"[AUTH] 토큰 발급 성공")
            return True
        else:
            print(f"[AUTH] 토큰 발급 실패: {res.text}")
            return False
    
    def get_balance(self):
        """계좌 잔고 조회"""
        if KIS_MOCK:
            tr_id = "VTTC8434R"  # 모의투자
        else:
            tr_id = "TTTC8434R"  # 실전투자
        
        url = f"{self.base_url}/uapi/domestic-stock/v1/trading/inquire-balance"
        headers = self._get_headers(tr_id)
        params = {
            "CANO": self.account_no,
            "ACNT_PRDT_CD": self.account_cd,
            "AFHR_FLPR_YN": "N",
            "OFL_YN": "",
            "INQR_DVSN": "02",
            "UNPR_DVSN": "01",
            "FUND_STTL_ICLD_YN": "N",
            "FNCG_AMT_AUTO_RDPT_YN": "N",
            "PRCS_DVSN": "01",
            "CTX_AREA_FK100": "",
            "CTX_AREA_NK100": ""
        }
        
        res = requests.get(url, headers=headers, params=params)
        if res.status_code == 200:
            return res.json()
        else:
            print(f"[BALANCE] 조회 실패: {res.text}")
            return None
    
    def get_current_price(self, ticker=TICKER):
        """현재가 조회"""
        if KIS_MOCK:
            tr_id = "FHKST01010100"
        else:
            tr_id = "FHKST01010100"
        
        url = f"{self.base_url}/uapi/domestic-stock/v1/quotations/inquire-price"
        headers = self._get_headers(tr_id)
        params = {
            "FID_COND_MRKT_DIV_CODE": "J",
            "FID_INPUT_ISCD": ticker
        }
        
        res = requests.get(url, headers=headers, params=params)
        if res.status_code == 200:
            data = res.json()
            return int(data["output"]["stck_prpr"])  # 현재가
        else:
            print(f"[PRICE] 조회 실패: {res.text}")
            return None
    
    def buy_stock(self, ticker, quantity):
        """매수 주문"""
        if KIS_MOCK:
            tr_id = "VTTC0802U"  # 모의투자
        else:
            tr_id = "TTTC0802U"  # 실전투자
        
        url = f"{self.base_url}/uapi/domestic-stock/v1/trading/order-cash"
        headers = self._get_headers(tr_id)
        body = {
            "CANO": self.account_no,
            "ACNT_PRDT_CD": self.account_cd,
            "PDNO": ticker,
            "ORD_DVSN": "01",  # 시장가
            "ORD_QTY": str(quantity),
            "ORD_UNPR": "0"
        }
        
        res = requests.post(url, headers=headers, json=body)
        if res.status_code == 200:
            data = res.json()
            if data["rt_cd"] == "0":
                print(f"[BUY] 매수 주문 성공: {ticker} {quantity}주")
                return data
            else:
                print(f"[BUY] 매수 주문 실패: {data['msg1']}")
                return None
        else:
            print(f"[BUY] 매수 주문 실패: {res.text}")
            return None
    
    def sell_stock(self, ticker, quantity):
        """매도 주문"""
        if KIS_MOCK:
            tr_id = "VTTC0801U"  # 모의투자
        else:
            tr_id = "TTTC0801U"  # 실전투자
        
        url = f"{self.base_url}/uapi/domestic-stock/v1/trading/order-cash"
        headers = self._get_headers(tr_id)
        body = {
            "CANO": self.account_no,
            "ACNT_PRDT_CD": self.account_cd,
            "PDNO": ticker,
            "ORD_DVSN": "01",  # 시장가
            "ORD_QTY": str(quantity),
            "ORD_UNPR": "0"
        }
        
        res = requests.post(url, headers=headers, json=body)
        if res.status_code == 200:
            data = res.json()
            if data["rt_cd"] == "0":
                print(f"[SELL] 매도 주문 성공: {ticker} {quantity}주")
                return data
            else:
                print(f"[SELL] 매도 주문 실패: {data['msg1']}")
                return None
        else:
            print(f"[SELL] 매도 주문 실패: {res.text}")
            return None
    
    def parse_balance(self, balance_data):
        """잔고 데이터 파싱"""
        if not balance_data:
            return None
        
        result = {
            "cash": 0,
            "stock_value": 0,
            "stock_quantity": 0,
            "total": 0
        }
        
        # 예수금 (현금)
        output2 = balance_data.get("output2", [])
        if output2:
            result["cash"] = int(output2[0].get("dnca_tot_amt", 0))
        
        # 보유 주식
        output1 = balance_data.get("output1", [])
        for stock in output1:
            if stock.get("pdno") == TICKER:
                result["stock_quantity"] = int(stock.get("hldg_qty", 0))
                result["stock_value"] = int(stock.get("evlu_amt", 0))
        
        result["total"] = result["cash"] + result["stock_value"]
        
        return result