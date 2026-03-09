import sys
input = sys.stdin.readline

N = int(input())

tt = 0

for _ in range(N):
    tt += int(input())
print(tt-N+1)