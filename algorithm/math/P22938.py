a,b,c = map(int, input().split(" "))
x,y,z = map(int, input().split(" "))

d = (a-x)**2+(b-y)**2

if (c+z)**2 > d:
    print("YES")
else:
    print("NO")