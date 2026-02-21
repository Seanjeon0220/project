n,k=map(int,input().split())
c=0
while n<=k//2:
    c+=1+(k&1)
    k=k//2
print(c+k-n)