S = input()
T = input()

ans = ""

for i in T:
    if i not in S:
        ans += i
print(ans)