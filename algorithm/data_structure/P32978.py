N = int(input())

given = list(input().split(" "))
used = list(input().split(" "))

for i in given:
    if i in used:
        continue
    else:
        print(i)