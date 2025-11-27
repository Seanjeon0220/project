def counting_point(n):
    n=n.split(" ")
    x1=int(n[0])
    y1=int(n[1])
    r1=int(n[2])
    x2=int(n[3])
    y2=int(n[4])
    r2=int(n[5])
    center_distance=((x1-x2)**2+(y1-y2)**2)**(0.5)
    if x1==x2 and y1==y2 and r1==r2:
        result=-1
    else:
        if center_distance>r1+r2:
            result=0
        elif center_distance==r1+r2:
            result=1
        else:
            if center_distance==max(r1,r2)-min(r1,r2):
                result=1
            elif center_distance>max(r1,r2)-min(r1,r2):
                result=2
            else:
                result=0
    return result
    
k=int(input())
for i in range (0,k):
    n=input()
    print(counting_point(n))