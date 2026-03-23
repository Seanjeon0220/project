X, Y = map(int, input().split())

s = [X/Y]

for _ in range(int(input())):
    Xt, Yt = map(int, input().split())
    s.append(Xt/Yt)
print("%.2f" % (min(s)*1000))