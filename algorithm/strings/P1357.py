def Rev(x):
    if 1000<=x:
        a=x//1000
        b=x//100-10*a
        c=x//10-(100*a+10*b)
        d=x%10
        e=1000*d+100*c+10*b+a
        return e
    elif 100<=x and x<=999:
        a=x//100
        b=x//10-10*a
        c=x%10
        d=100*c+10*b+a
        return d
    elif 10<=x:
        a=x//10
        b=x-10*a
        d=10*b+a
        return d
    else:        
        return x
    
list0=input()
list0=list0.split(" ")
k=Rev(Rev(int(list0[0]))+Rev(int(list0[1])))
print(k)