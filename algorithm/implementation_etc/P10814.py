# 10814

n=int(input())
cl=[]
for i in range(0,n):
    k=input()
    l=k.split(" ")
    l[0]=int(l[0])
    l.insert(1,i)
    cl.append(l)
cl.sort()

for a in range(0,len(cl)):
    print(cl[a][0],cl[a][2])