def counting_star(trees,cut):
    result=0
    for i in trees:
        if i>cut:
            result+=i-cut
        else:
            pass
    return result

n=input()
n=n.split(" ")
N=int(n[0])
M=int(n[1])
k=input()
k=k.split(" ")
k1=[]
for i in range(0,len(k)):
    k1.append(int(k[i]))
start=0
end=max(k1)

while start<=end:
    mid=(start+end)//2
    log=counting_star(k1,mid)
    if log>=M:
        start=mid+1
    else:
        end=mid-1

print(end)