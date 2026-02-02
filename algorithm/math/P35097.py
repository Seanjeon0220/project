while(True):
    n = int(input())

    if n == 0:
        break
    
    print(int((n*(n+1)/2)**2))