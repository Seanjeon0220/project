h1, m1 = map(int, input().split(":"))
h2, m2 = map(int, input().split(":"))

one = h1*60 + m1
two = h2*60 + m2

if one <= two:
    print("YES")
else:
    print("NO")