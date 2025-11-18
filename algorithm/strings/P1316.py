num=int(input())
num_list=[]
sum0=0
for i in range(0,num):
    n=input()
    num_list.append(n)
for p in num_list:
    list0=[]
    temp=0
    check=True
    for q in range(0,len(p)):
        if p[q] in list0:
            check=False
            break
        else:
            if p[q]==temp:
                pass
            else:
                list0.append(temp)
                temp=p[q]
    if check==True:
        sum0+=1
    else:
        pass
print(sum0)