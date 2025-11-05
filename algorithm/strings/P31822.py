check = input()[0:5]
n = int(input())
ans = 0

for i in range(n):
    temp = input()
    if temp[0:5] == check:
        ans += 1

print(ans)