N, W, H = map(int, input().split())
check = W*W + H*H

for i in range (0,N):
    temp = int(input())
    if(temp*temp > check):
        print("NE")
    else:
        print("DA")