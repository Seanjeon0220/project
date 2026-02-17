n, m = map(int, input().split(" "))
cnt = 0
stack = []

for i in range(n):
    first = list(input())
    stack.append(first)

for j in range(n):
    for k in range(m - 1):
        if (stack[j][k] == "." and stack[j][k + 1] == "#") or (stack[j][k] == "#" and stack[j][k + 1] == "."):
            cnt += 1

for p in range(n - 1):
    if p % 2 == 0:
        if (stack[p][0] == "." and stack[p + 1][0] == "#") or (stack[p][0] == "#" and stack[p + 1][0] == "."):
            cnt += 1
        for q in range(1, m):
            if (stack[p][q] == "." and stack[p + 1][q] == "#") or (stack[p][q] == "#" and stack[p + 1][q] == "."):
                cnt += 1
            if (stack[p][q] == "." and stack[p + 1][q - 1] == "#") or (stack[p][q] == "#" and stack[p + 1][q - 1] == "."):
                cnt += 1
    else:
        for t in range(m - 1):
            if (stack[p][t] == "." and stack[p + 1][t] == "#") or (stack[p][t] == "#" and stack[p + 1][t] == "."):
                cnt += 1
            if (stack[p][t] == "." and stack[p + 1][t + 1] == "#") or (stack[p][t] == "#" and stack[p + 1][t + 1] == "."):
                cnt += 1
        if (stack[p][m - 1] == "." and stack[p + 1][m - 1] == "#") or (stack[p][m - 1] == "#" and stack[p + 1][m - 1] == "."):
            cnt += 1

print(cnt)