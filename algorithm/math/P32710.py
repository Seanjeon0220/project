def check(n):
    for i in range(1,10):
        for j in range(1,10):
            if n == i*j:
                return 1
    return 0




N = int(input())
print(check(N))
