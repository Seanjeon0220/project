N = int(input())

for i in range(N):
    num = list(map(int, input().split()))
    sum = 0
    check = 100
    for j in range(len(num)):
        if(num[j] % 2 == 0):
            sum += num[j]
            if(num[j] < check):
                check = num[j]
    print(sum, check)