n=input()
n=n.split(" ")

x=int(n[0])
y=int(n[1])
w=int(n[2])
s=int(n[3])

k=max(x,y)
l=min(x,y)

if 2*w<s:
    print(w*(k+l))
elif w<s:
    print(l*s+(k-l)*w)
else:
    if (k-l)%2==0:
        print(k*s)
    else:
        print((k-1)*s+w)