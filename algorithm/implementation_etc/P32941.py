T, X = map(int, input().split())
N = int(input())

check = True

for i in range(N):
    temp = int(input())
    templ = list(map(int, input().split()))

    if X in templ:
        continue
    else:
        check = False
        break

if check:
    print("YES")
else:
    print("NO")