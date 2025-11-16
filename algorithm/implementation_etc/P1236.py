n=input()
n=n.split(" ")
n[0]=int(n[0])
n[1]=int(n[1])
castle=[]
sum1=0
sum2=0
for a in range(0,n[0]):
    k=input()
    castle.append(k)
for i in range(0,n[0]):
    if castle[i].count("X")==0:
        sum1+=1
for p in range(0,n[1]):
    num_check=False
    for q in range(0,n[0]):
        if castle[q][p]=="X":
            num_check=True
    if num_check==False:
        sum2+=1
print(max(sum1,sum2))