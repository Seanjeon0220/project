N = int(input())
max = 0

for i in range(N):
    a,b = map(int, input().split())
    temp = a*b
    if temp > max:
        max = temp
print(max)