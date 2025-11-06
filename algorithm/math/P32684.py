cha1, po1, ma1, sang1, sa1, jol1 = map(int, input().split(" "))
cha2, po2, ma2, sang2, sa2, jol2 = map(int, input().split(" "))

c = cha1*13+po1*7+ma1*5+sang1*3+sa1*3+jol1*2
h = cha2*13+po2*7+ma2*5+sang2*3+sa2*3+jol2*2 + 1.5

if c>h:
    print("cocjr0208")
else:
    print("ekwoo")
