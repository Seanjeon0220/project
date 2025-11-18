# 1010
def comb(x,y):
    product1=1
    product2=1
    y1=y
    for a in range(x):
        product1=product1*y1
        y1=y1-1
    for b in range (x,0,-1):
        product2=product2*b
    return int(product1/product2)

T=int(input())
list0=[]
for a in range(T):
    list0.append(input().split(" "))
for i in range(0,len(list0)):
    for j in range(0,len(list0[i])):
        list0[i][j]=int(list0[i][j])    
for i in range(0,len(list0)):
    print(comb(list0[i][0],list0[i][1]))