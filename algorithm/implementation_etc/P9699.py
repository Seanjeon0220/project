N = int(input())

for i in range(0,N):
    num = list(map(int, input().split()))
    num.sort()
    print("Case #" + str(i+1) +": "+ str(num[4]))

