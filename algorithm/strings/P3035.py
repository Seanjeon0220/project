a=input()
list0=a.split(" ")
A=[]
B=[]
B1=[]
C=[]
for i in range(0,int(list0[0])):
    k=input()
    A.append(k)
for p in range(0,int(list0[0])):
    for q in range(0,int(list0[1])):
        for z in range(0,int(list0[3])):
            B1.append(A[p][q])
    B.append(B1)
    B1=[]
for k in range(0,len(B)):
    for j in range(0,int(list0[2])):
        C.append(B[k])
for p in C:
    for q in p:
        print(q,end='')
    print()