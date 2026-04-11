import math
import sys

input = sys.stdin.readline
while True:
    n = input().split()
    l = len(n[0])

    if n[0] == "0":
        break

    sum = 0
    for i in range(l):
        sum += int(n[0][i])*math.factorial(l)
        l -= 1
    print(sum)