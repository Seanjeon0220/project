N = int(input())
number = list(map(int, input().split(" ")))

d1, d2 = [],[]

for _ in range(N):
    d1.append(1)
    d2.append(1)

for i in range(N-1):
    if number[i+1] >= number[i]:
        d1[i+1] += d1[i]

for j in range(N-1):
    if number[j+1] <= number[j]:
        d2[j+1] += d2[j]


max1 = 0
max2 = 0

for k in range(N):
    if d1[k] > max1:
        max1 = d1[k]
    if d2[k] > max2:
        max2 = d2[k]

print(max(max1, max2))