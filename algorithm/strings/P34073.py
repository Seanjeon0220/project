N = int(input())

S = input()

ans = ""

for i in range(len(S)):
    if S[i] != " ":
        ans += S[i]
    else:
        ans += "DORO "

print(ans + "DORO")