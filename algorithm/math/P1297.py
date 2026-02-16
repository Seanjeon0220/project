d,h,w = map(int, input().split(" "))

r = d/(h**2+w**2)**(1/2)

height = int(h*r)
width = int(w*r)

print(height, width)