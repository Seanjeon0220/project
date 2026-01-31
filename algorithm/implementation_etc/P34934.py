N = int(input())

for i in range(N):
    name, y = input().split(" ")
    year = int(y)
    if year==2026:
        print(name)
        break