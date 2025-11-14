n=input()
p=input()
sum1=0
p=p.split(" ")
for a in range(0,len(p)):
    p[a]=int(p[a])  

zero=[0 for i in range(100)]
for a in range(1,101):
    for k in p:
        if k==a:
            zero[a-1]=zero[a-1]+1
for a in zero:
    if a>1:
        sum1=sum1+(a-1)
print(sum1)