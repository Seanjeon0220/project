n,k=map(int,input().split())
ans=0
while n<=k//2:
    ans+=1+(k&1)
    k=k//2
print(ans+k-n)