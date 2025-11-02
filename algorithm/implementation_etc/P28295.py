asum = 0

for i in range(0,10):
    sum += int(input())

check = sum%4

if check == 0:
    print("N")
elif check == 1:
    print("E")
elif check == 2:
    print("S")
else:
    print("W")