def check(n):
    d = n%100
    if (n+1) % d == 0:
        return "Good"
    return "Bye"


N = int(input())

for i in range(N):
    temp = int(input())
    print(check(temp))