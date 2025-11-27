p=[0,1]
n=int(input())

for a in range(2,41):
    p.append(p[a-1]+p[a-2])
    
result=[]
for q in range(0,n):
    k=int(input())
    result.append(k)
    
    
for h in result:
    if h==0:
        print("1 0")
    else:
        print(p[h-1],end=' ')
        print(p[h])