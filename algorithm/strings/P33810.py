check = "SciComLove"

tmp = input()

ans = 0

for i in range(len(tmp)):
    if tmp[i] != check[i]:
        ans += 1
print(ans)