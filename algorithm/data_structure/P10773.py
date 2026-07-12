import sys

n=int(input())
result=[]

for i in range(0,n):
    k=int(sys.stdin.readline().strip())
    if k==0:
        result.pop()
    else:
        result.append(k)
p=sum(result)
print(p)