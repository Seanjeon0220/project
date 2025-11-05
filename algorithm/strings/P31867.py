even = [2,4,6,8,0]
sum = 0

n = int(input())
num = input()

for i in range(n):
    temp= int(num[i])
    if temp in even:
        sum -=1
    else:
        sum +=1

if sum > 0:
    print(1)
elif sum < 0:
    print(0)
else:
    print(-1)