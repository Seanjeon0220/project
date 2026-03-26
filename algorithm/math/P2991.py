A, B, C, D = map(int, input().split(" "))
ppl = list(map(int, input().split(" ")))

for p in ppl:
    at = 0
    if 0 < p%(A+B) <= A:
        at += 1
    if 0 < p%(C+D) <= C:
        at += 1
    print(at)