
n=input()
result=0
i=len(n)
k=0
while k<=i-1:
    if i-1==k:
        result+=1
        break
    else:
        if n[k]=="d":
            if n[k+1]=="z":
                if i-1==k+1:
                    result+=2
                    break
                else:    
                    if n[k+2]=="=":
                        k=k+3
                        result+=1
                    else:
                        k=k+2
                        result+=2
            elif n[k+1]=="-":
                k=k+2
                result+=1
            else:
                k+=1
                result+=1
        elif n[k]=="l" or n[k]=="n":
            if i-1==k:
                result+=1
                break
            else:
                if n[k+1]=="j":
                    k=k+2
                    result+=1
                else:
                    k=k+1
                    result+=1
        elif n[k]=="c":
            if i-1==k:
                result+=1
                break
            else:
                if n[k+1]=="=" or n[k+1]=="-":
                    k=k+2
                    result+=1
                else:
                    k=k+1
                    result+=1
        elif n[k]=="s":
            if i-1==k:
                result+=1
                break
            else:
                if n[k+1]=="=":
                    k=k+2
                    result+=1
                else:
                    k=k+1
                    result+=1
        elif n[k]=="z":
            if i-1==k:
                result+=1
                break
            else:
                if n[k+1]=="=":
                    k=k+2
                    result+=1
                else:
                    k=k+1
                    result+=1
        else:
            k=k+1
            result+=1
print(result)