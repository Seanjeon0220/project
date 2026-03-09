while True:
    l = list(map(int, input().split(" ")))
    if l[0] == 0:
        break
    n = 1
    for i in range(l[0]):
        s = l[2*i+1]
        p = l[2*i+2]
        n = n*s - p
    print(n)