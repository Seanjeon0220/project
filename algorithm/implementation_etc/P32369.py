def manipulation(G,B,a,b):
    return

N, A, B = map(int, input().split())

c, d = 1, 1

while(N>0):
    c += A
    d += B

    if d>c:
        temp = c
        c = d
        d = temp
    elif c == d:
        d -= 1
    N-=1

print(c, d)