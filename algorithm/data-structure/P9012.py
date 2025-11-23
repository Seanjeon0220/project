# 9012

def text(k):
    result=[]
    for i in range(0,len(k)):
        if k[i]=="(":
            result.append("unit")
        else:
            if len(result)!=0:
                if result[-1]=="unit": 
                    result.pop()
                else:
                    return("NO")
            else:
                return("NO")
    if len(result)==0:
        return("YES")
    else:
        return("NO")

def guacamole(k):
    a=k.count("(")
    b=k.count(")")
    if a==b:
        if k[0]==")" or k[-1]=="(":
            return("NO")
        else:
            return(text(k))
    else:
        return("NO")
    
    

n=int(input())
for i in range(0,n):
    k=input()
    print(guacamole(k))