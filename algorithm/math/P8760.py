N = int(input())

for i in range(0,N):
    W, H = map(int, input().split())
    print((W*H)//2)
