def guacamole(n,cur,via,dest):
    if n>20:
        pass
    else:
        if n==1:
            print(cur,dest)
        else:
            guacamole(n-1,cur,dest,via)
            print(cur,dest)
            guacamole(n-1,via,cur,dest)
    
k=int(input())
print((2**k)-1)
guacamole(k,"1","2","3")