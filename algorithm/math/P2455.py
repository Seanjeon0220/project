temp = 0
max = 0

for i in range(4):
    a,b = map(int, input().split())
    temp = temp - a + b
    if temp > max:
        max = temp
print(max)