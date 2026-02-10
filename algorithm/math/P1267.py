def Ysum(t):
    cnt = 0
    while(t>=0):
        t -= 30
        cnt+=1
    return cnt*10

def Msum(t):
    cnt = 0
    while(t>=0):
        t -= 60
        cnt += 1
    return cnt*15

N = int(input())

time = list(map(int, input().split(" ")))

Y, M = 0,0

for temp in time:
    Y += Ysum(temp)
    M += Msum(temp)

if Y > M:
    print("M", M)
elif Y < M:
    print("Y", Y)
else:
    print("Y M", M)