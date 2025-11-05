N,X = map(int, input().split(" "))
max = -1


for _ in range(N):
    S, T = map(int, input().split(" "))

    if S+T<=X and S>max:
            max = S
        
print(max)