def w(k):
    sum = 0
    for i in range(1,k+1):
        sum += i*(i+1)*(i+2)//2
    return sum

N = int(input())

for _ in range(N):
    temp = int(input())
    print(w(temp))