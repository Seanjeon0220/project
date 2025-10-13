a,b,c = map(int, input().split())

if a == b and b == c:
    ans = 10000 + 1000*a
elif a == b and a != c:
    ans = 1000 + 100*a
elif a == c and a != b:
    ans = 1000 + 100*a
elif b == c and b != a:
    ans = 1000 + 100*b
else:
    if a > b and a > c:
        ans = a*100
    elif b > c and b > a:
        ans = b*100
    else:
        ans = c*100

print(ans)