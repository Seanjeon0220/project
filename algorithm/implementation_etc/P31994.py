max = 0

for _ in range(7):
    name, temp = input().split(" ")
    num = int(temp)
    if num > max:
        max = num
        result = name
print(result)