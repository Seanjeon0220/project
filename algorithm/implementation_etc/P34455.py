begin = int(input())

N = int(input())

for i in range(N):
    sign = input()
    temp = int(input())
    if sign == "+":
        begin += temp
    else:
        begin -= temp

print(begin)