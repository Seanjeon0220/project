import sys

input = sys.stdin.readline

N = int(input())

stick = []

for _ in range(N):
    stick.append(int(input()))

last = stick[-1]
cnt = 1

for i in reversed(range(N)):
    if stick[i] > last:
        cnt += 1
        last = stick[i]
print(cnt)