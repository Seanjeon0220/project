n=int(input())
value_list=[]
dd=[]
for i in range(0,n):
    k=input()
    k=k.split(" ")
    value_list.append((int(k[0]),int(k[1])))
    dd.append(0)
k=0
for j in value_list:
    for p in value_list:
        if j[0] < p[0]:
            if j[1] < p[1]:
                dd[k]+=1
            else:
                pass
        else:
            pass
    k+=1

for i in dd:
    print(i+1,end=' ')
