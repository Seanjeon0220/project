total = []

for _ in range(5):
    sc = list(map(int, input().split(" ")))
    total.append(sum(sc))

print(total.index(max(total))+1,max(total))