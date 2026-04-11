n = int(input())

for _ in range(n):
    a,b,c,d,e = map(int, input().split(" "))
    r = a*350.34 + b*230.9 + c*190.55 + d*125.3 + e*180.9
    print("$%.2f" % (r))