# 1268

n=int(input())
list0=[]
list1=[ [0] * n for _ in range(n) ]
list2=[]
for i in range(1,n+1):
    k=input()
    list0.append(k.split(" "))
for z in range(0,5):
    for p in range(0,n):
        for q in range(0,n):
            if list0[p][z]==list0[q][z]:
                list1[p][q]=1
        
for y in list1:
    C=y.count(1)
    list2.append(C)
M=max(list2)
N=list2.index(M)
print(N+1)
