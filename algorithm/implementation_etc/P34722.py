N = int(input())
sum = 0

for i in range(N):
    a,b,c,d = map(int,input().split(" "))
    if a >= 1000 or b>=1600 or c>=1500 or (d>0 and d<=30):
        sum += 1


print(sum)