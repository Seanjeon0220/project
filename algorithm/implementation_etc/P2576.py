sum = 0
num = list()

for i in range(0,7):
    temp = int(input())

    if(temp%2 != 0):
        sum += temp
        num.append(temp)
num.sort()

if(sum == 0):
    print(-1)
else:
    print(sum)
    print(num[0])