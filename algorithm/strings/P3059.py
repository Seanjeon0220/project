def sum (tmp):
    sum = 0
    for i in tmp:
        sum += ord(i)
    return sum

N = int(input())

for k in range(N):
    temp = list(input())
    tmp = set(temp)
    print(2015-sum(tmp))