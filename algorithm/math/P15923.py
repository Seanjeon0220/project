N = int(input())

A = []
B = []

for _ in range(N):
    a,b = map(int, input().split(" "))
    A.append(a)
    B.append(b)
ans = ((max(A)-min(A)+max(B)-min(B))*2)

print(ans)