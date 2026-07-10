# ============================================
# Shannon's Demon Trading - Configuration
# ============================================

import os
from dotenv import load_dotenv

load_dotenv()

# === KIS API 설정 ===
KIS_APP_KEY = os.getenv("KIS_APP_KEY", "your_app_key")
KIS_APP_SECRET = os.getenv("KIS_APP_SECRET", "your_app_secret")
KIS_ACCOUNT_NO = os.getenv("KIS_ACCOUNT_NO", "00000000-00")  # 계좌번호-상품코드
KIS_MOCK = os.getenv("KIS_MOCK", "true").lower() == "true"  # 모의투자 여부

# === KIS API URL ===
KIS_BASE_URL = "https://openapivts.koreainvestment.com:29443" if KIS_MOCK else "https://openapi.koreainvestment.com:9443"

# === 트레이딩 설정 ===
TICKER = "069500"  # KODEX 200
STOCK_RATIO = 0.5  # 목표 주식 비율
MIN_TRADE_AMOUNT = 10000  # 최소 거래 금액 (원)

# === 리밸런싱 스케줄 ===
REBALANCE_DAYS = ["monday", "wednesday", "friday"]
REBALANCE_HOUR = 10
REBALANCE_MINUTE = 0

# === 텔레그램 알림 ===
TELEGRAM_BOT_TOKEN = os.getenv("TELEGRAM_BOT_TOKEN", "")
TELEGRAM_CHAT_ID = os.getenv("TELEGRAM_CHAT_ID", "")

# === 로깅 ===
LOG_LEVEL = "INFO"

# 거래 비용 (이미 있음, 확인용)
TRADING_FEE = 0.00015         # 증권사 수수료: 0.015%
TRADING_TAX = 0.0018          # 증권거래세: 0.18% (매도 시에만)
TOTAL_SELL_COST = TRADING_FEE + TRADING_TAX  # 총 매도 비용: ~0.195%
TOTAL_BUY_COST = TRADING_FEE  # 총 매수 비용: 0.015%
