n = int(input())

total = list(map(int,input().split()))
sum = 0

for i in range(n):
    sum += total[i]

sum += 8*(n-1)

d = sum//24
h = sum%24

print(d,h)