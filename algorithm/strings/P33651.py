check = "UAPC"
ans = ""
S = input()

for i in check:
    if i in S:
        continue
    else:
        ans += i
print(ans)