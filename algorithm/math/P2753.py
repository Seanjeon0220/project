n = (int)(input())

if n%4 == 0 and n%100!= 0:
    ans = 1
elif n%400 == 0:
    ans = 1
else:
    ans = 0

print(ans)