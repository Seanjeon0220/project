n, d = map(int, input().split())
sum = 0
mylist = []

for i in range(n):
    temp = int(input())
    mylist.append(temp)
    sum += temp

per  = d//sum

if n == 1:
    print(d)
else:
    for i in mylist:
        print(i * per)