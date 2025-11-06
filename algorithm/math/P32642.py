N = int(input())

rage = 0
sum = 0

check = list(map(int, input().split(" ")))


for j in range(N):
    if check[j] == 0:
        rage -=1
        sum += rage
    else:
        rage +=1
        sum += rage
print(sum)