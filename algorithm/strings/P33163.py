N = int(input())
S = input()
ans = ""

for i in S:
    if i == "J":
        ans += "O"
    elif i == "O":
        ans += "I"
    else:
        ans += "J"
print(ans)