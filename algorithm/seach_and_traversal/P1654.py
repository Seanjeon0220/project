def chris(lines,cut):
    result=0
    for i in lines:
        if i>=cut:
            result=result+(i//cut)
        else:
            pass
    return result

n=input()
n=n.split(" ")
N=int(n[0])
M=int(n[1])
k1=[]
for i in range(0,N):
    k=input()
    k1.append(int(k))
start=1
end=max(k1)

while start<=end:
    mid=(start+end)//2
    lan=chris(k1,mid)
    if lan>=M:
        start=mid+1
    else:
        end=mid-1

print(end)