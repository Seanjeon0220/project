# 4949

def nbdg(n):
    bitter=[]
    for i in range(0,len(n)):
        if n[i]=="(":
            bitter.append("a")
        elif n[i]==")":
            if len(bitter)==0:
                return "no"
            else:
                if bitter[-1]=="a":
                    bitter.pop()
                else:
                    return "no"
        elif n[i]=="[":
            bitter.append("b") 
        
        elif n[i]=="]":
            if len(bitter)==0:
                return "no"
            else:
                if bitter[-1]=="b":
                    bitter.pop()
                else:
                    return "no"
        else:
            pass
        
    if len(bitter)==0:
        return "yes"
    else:
        return "no"
    
gcml=[]
while True:    
    k=input()
    
    if k==".":
        break
    else:
        gcml.append(k)

for i in gcml:
    print(nbdg(i))