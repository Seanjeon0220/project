N = int(input())

pre = list(map(int, input().split(" ")))
tick = list(map(int, input().split(" ")))

A = 0
B = 0

for i in range(N):
    A += pre[i]
    check = tick[i]
    if check == 0:
        B += pre[i]
print(A)
print(B)