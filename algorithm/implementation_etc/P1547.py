N = int(input())

current = 1

for i in range(N):
    beginning, end = map(int, input().split(" "))
    if beginning == current:
        current = end
    elif end == current:
        current = beginning
print(current)
