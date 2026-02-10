n = int(input())

sum = 0

ans = 0

k = list(map(int, input().split(" ")))

for i in range(n):
    if k[i] == 1:
        sum += 1
        ans += sum
    else:
        sum = 0

print(ans)