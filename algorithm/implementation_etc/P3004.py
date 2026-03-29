N = int(input())

ans = 1
s = 1

for i in range(N):
    ans += s
    if i%2 == 0:
        s += 1
print(ans)