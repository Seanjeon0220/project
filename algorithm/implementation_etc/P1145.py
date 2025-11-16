list0=input()
list0=list0.split(" ")
for i in range(0,len(list0)):
    list0[i]=int(list0[i])
for a in range(min(list0),list0[0]*list0[1]*list0[2]*list0[3]*list0[4]):
    list1=[]
    list1.append(a%list0[0])
    list1.append(a%list0[1])
    list1.append(a%list0[2])
    list1.append(a%list0[3])
    list1.append(a%list0[4])
    p=list1.count(0)
    if p>=3:
        print(a)
        break