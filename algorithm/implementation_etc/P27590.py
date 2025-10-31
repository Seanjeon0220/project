xs, ys = map(int, input().split())
xm, ym = map(int, input().split())
i = 1

while(True):
    if (xs+i)%ys == 0 and (xm+i)%ym == 0:
        print(i)
        break
    i +=1
