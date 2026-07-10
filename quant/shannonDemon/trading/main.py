# ============================================
# Shannon's Demon Trading - 메인 진입점
# ============================================

import sys
from rebalancer import Rebalancer
from scheduler import run_scheduler


def main():
    print("=" * 50)
    print(" Shannon's Demon Trading")
    print("=" * 50)
    print("\n사용법:")
    print("  python main.py run       - 즉시 리밸런싱 실행")
    print("  python main.py status    - 현재 상태 조회")
    print("  python main.py schedule  - 스케줄러 시작")
    print()
    
    if len(sys.argv) < 2:
        print("명령어를 입력하세요.")
        return
    
    command = sys.argv[1].lower()
    
    if command == "run":
        # 즉시 리밸런싱 실행
        rebalancer = Rebalancer()
        result = rebalancer.run()
        print(f"\n결과: {result}")
    
    elif command == "status":
        # 현재 상태 조회
        rebalancer = Rebalancer()
        status = rebalancer.get_status()
        
        if status:
            print("\n[현재 상태]")
            print(f"  현금: {status['cash']:,}원")
            print(f"  주식: {status['stock_value']:,}원 ({status['stock_quantity']}주)")
            print(f"  총자산: {status['total']:,}원")
            print(f"  주식비율: {status['stock_ratio']*100:.1f}%")
            print(f"  목표비율: {status['target_ratio']*100:.1f}%")
        else:
            print("상태 조회 실패")
    
    elif command == "schedule":
        # 스케줄러 시작
        run_scheduler()
    
    else:
        print(f"알 수 없는 명령어: {command}")


if __name__ == "__main__":
    main()
