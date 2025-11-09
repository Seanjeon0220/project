N = int(input())
ans = 0

for i in range(N):
    a,b,c = map(int, input().split())
    if a==b and a==c:
        temp = 10000 + a*1000
    elif a==b:
        temp = 1000 + a*100
    elif b==c:
        temp = 1000 + b*100
    elif c==a:
        temp = 1000 + c*100
    else:
        temp = max(max(a,b),c)*100
    if temp > ans:
        ans = temp
print(ans)