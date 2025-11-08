a, b = map(int, input().split())

max = max(a,b)
min = min(a,b)

ans = ""

if min == max:
    for i in range(max):
        ans += "2"
else:
    for i in range(max-min):
        ans += "1"
    for j in range(min):
        ans += "2"

print(ans)