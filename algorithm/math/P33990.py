N = int(input())

correct = -1

for i in range(N):
    a,b,c = map(int,input().split(" "))
    score = a+b+c
    if score >= 512:
        if abs(score-512) < abs(correct-512):
            correct = score
print(correct)