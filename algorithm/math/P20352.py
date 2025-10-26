import math

n = int(input())

r = math.sqrt(n/math.pi)

ans = round(2*math.pi*r, 10)

print(ans)