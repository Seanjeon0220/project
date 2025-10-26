a, b= map(int, input().split())

if a >= b:
    ans = b
else:
    ans = a+1

print(ans)