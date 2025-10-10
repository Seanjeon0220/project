N = int(input())

ans = 0

for i in range(N):
    temp = int(input())
    if temp %2 != 0:
        ans += 1

print(ans)