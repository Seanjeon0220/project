N = int(input())

tower = list(map(int,input().split(" ")))

ans = 0
current = 0

for i in range(N):
    temp = tower[i]
    if temp >= current:
        ans += 1
    current = temp
print(ans)