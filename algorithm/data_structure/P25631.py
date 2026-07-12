N = int(input())
M = list(map(int, input().split(" ")))
d = dict()
s = set(M)
ans = 0
for i in M:
    d[i] = d.get(i,0)+1
while d:
    for i in s:
        if d.get(i) != None:
            d[i] -= 1
            if d[i] == 0:
                 del d[i]
    ans += 1
print(ans)