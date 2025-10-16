N = int(input())
sub = []
result = 0

for i in range(N):
    temp = input()
    sub.append(temp)

for j in range(N):
    ans = input()
    if ans == sub[j]:
        result += 1

print(result)