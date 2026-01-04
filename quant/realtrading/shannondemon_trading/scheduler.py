# ============================================
# 스케줄러 (월/수/금 10:00 자동 실행)
# ============================================

import schedule
import time
from datetime import datetime
from rebalancer import Rebalancer
from config import REBALANCE_DAYS, REBALANCE_HOUR, REBALANCE_MINUTE


def job():
    """리밸런싱 작업"""
    print(f"\n[{datetime.now()}] 스케줄 작업 시작")
    
    rebalancer = Rebalancer()
    result = rebalancer.run()
    
    print(f"[{datetime.now()}] 작업 완료: {result}")


def run_scheduler():
    """스케줄러 실행"""
    time_str = f"{REBALANCE_HOUR:02d}:{REBALANCE_MINUTE:02d}"
    
    # 월/수/금 스케줄 등록
    for day in REBALANCE_DAYS:
        if day == "monday":
            schedule.every().monday.at(time_str).do(job)
        elif day == "wednesday":
            schedule.every().wednesday.at(time_str).do(job)
        elif day == "friday":
            schedule.every().friday.at(time_str).do(job)
    
    print("=" * 50)
    print(" Shannon's Demon Scheduler")
    print("=" * 50)
    print(f"리밸런싱 시간: {time_str}")
    print(f"리밸런싱 요일: {', '.join(REBALANCE_DAYS)}")
    print("=" * 50)
    print("스케줄러 실행 중... (Ctrl+C로 종료)")
    
    while True:
        schedule.run_pending()
        time.sleep(60)  # 1분마다 체크


if __name__ == "__main__":
    run_scheduler()