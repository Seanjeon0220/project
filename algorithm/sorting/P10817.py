n=input()
k=n.split(" ")
result=[]
for i in k:
    result.append(int(i))
def insert_sorting(n):
    for i in range(0,len(n)):
        for j in range(i+1,len(n)):
            if n[i]< n[j]:
                pass
            else:
                temp=n[i]
                n[i]=n[j]
                n[j]=temp
    return n[1]
print(insert_sorting(result))