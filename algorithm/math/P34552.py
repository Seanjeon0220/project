sum = 0

M = list(map(int, input().split(" ")))

N = int(input())

for i in range(N):
    B, L, S = map(float,input().split(" "))
    if L >= 2.0 and S >= 17:
        sum += M[int(B)]


print(sum)