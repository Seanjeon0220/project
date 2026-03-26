num = list(map(int, input().split(" ")))

num.sort()

d1, d2 = num[1]-num[0], num[2]-num[1]

if d1 == d2:
    print(num[2]+d1)
else:
    d = min(d1, d2)
    if d2 != d:
        print(num[2]-d)
    else:
        print(num[1]-d)