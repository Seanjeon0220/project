p=[1,1,1,2,2]
n=int(input())
for i in range(5,100):
    p.append(p[i-1]+p[i-5])

result=[]
for i in range(0,n):
    k=int(input())
    result.append(p[k-1])
for i in result:
    print(i)