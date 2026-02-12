N = int(input())
init = int(input())

check = True

max_cnt = init

for _ in range(N):
    In, Out = map(int, input().split(" "))
    init = init + In - Out
    if init < 0:
        check = False
    if max_cnt < init:
        max_cnt = init

if check:
    print(max_cnt)
else:
    print(0)