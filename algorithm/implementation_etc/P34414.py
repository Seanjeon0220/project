N = int(input())
ck = True

for i in range(N):
    temp = int(input())
    
    if temp < 48:
        print("False")
        ck = False
        break
if ck: 
    print("True")