N = int(input())

ak = list(map(int, input().split(" ")))

sak = set(ak)

if len(ak) != len(sak):
    print(0)
else:
    print(1)