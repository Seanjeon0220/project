str = input()

ans = ""

for i in str:
    if i == ".":
        break
    else:
        ans += i

print(ans)