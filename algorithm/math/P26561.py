n = int(input())

for i in range(n):
    a,b = map(int, input().split())
    d = b//7
    r = b//4
    print(a - d + r)