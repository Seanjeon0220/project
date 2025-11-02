N = int(input())

li = list(map(int, input().split()))

for i in range(N):
    tmp = li[i]
    if tmp == 300:
        print("1", end = " ")
    elif tmp >= 275:
        print("2", end = " ")
    elif tmp >= 250:
        print("3", end = " ")
    else:
        print("4", end = " ")