c=int(input())
list0=[]
suma=0
count=0
for a in range(c):
    list0.append(input().split(" "))
for i in range(0,len(list0)):
    for j in range(0,len(list0[i])):
        list0[i][j]=int(list0[i][j])
for b in range(0,len(list0)):
    suma=0
    count=0
    for c in range (0,len(list0[b])):
        if c!=0:
            suma=suma+list0[b][c]
    avg=suma/list0[b][0]
    for d in range(0,len(list0[b])):
        if d!=0:
            if avg<list0[b][d]:
                count=count+1
    print(str("{:.3f}".format((count*100)/list0[b][0]))+"%")