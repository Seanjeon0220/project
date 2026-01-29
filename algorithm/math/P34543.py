landmark = int(input())
walk = int(input())

if landmark < 3:
    sum = landmark*10
elif landmark < 5:
    sum = landmark*10+20
else:
    sum = landmark*10+70

if walk > 1000:
    print(max(0,sum-15))
else:
    print(sum)