def change(n):
    result_list=[]
    for i in range(0,len(n)):
        result_list.append(int(n[i]))
    return result_list

def sorting(k):
    for i in range(0,len(k)):
        for j in range(i+1,len(k)):
            if k[i]> k[j]:
                pass
            else:
                temp=k[i]
                k[i]=k[j]
                k[j]=temp
    return k


n=input()
for i in sorting(change(n)):
    print(i,end='')