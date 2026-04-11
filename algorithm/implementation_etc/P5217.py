T = int(input())

for _ in range(T):
    tmp = int(input())
    s = 1
    print("Pairs for %d:" %tmp, end = " ")
    
    for i in range((tmp-1)//2):
        if i!=0:
            print(",",end = " ")
        print(s, tmp-s, end= "")
        s += 1
    print()