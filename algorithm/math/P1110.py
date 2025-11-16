n=int(input())
n1=n
count=0
while True:
    if n1<10:
        p=n1
    
    else:
        p=int("{:.0f}".format(n1/10+n1%10*9/10))
        
    n2=10*(n1%10)+(p%10)
    n1=n2
    count=count+1
    if n1==n:
        break

        
print(count)