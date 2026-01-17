_ = int(input())

n = list(map(int, input().split(" ")))
gap = n[1] - n[0]

print(n[-1]+gap)