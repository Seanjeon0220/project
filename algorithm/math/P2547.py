T = int(input())

for i in range(0,T):
    trash = input()
    N = int(input())
    sum = 0
    for j in range(0,N):
        temp = int(input())
        sum += temp
    
    if(sum%N == 0):
        print("YES")
    else:
        print("NO")
