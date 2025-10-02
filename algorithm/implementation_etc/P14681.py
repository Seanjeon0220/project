a = int(input())
b = int(input())

if a*b > 0:
    if a > 0:
        ans = 1
    else:
        ans = 3
else:
    if a > 0:
        ans = 4
    else:
        ans = 2
print(ans)
