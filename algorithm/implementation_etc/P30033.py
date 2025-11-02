n = int(input())

list1 = list(input().split())
list2 = list(input().split())
sum = 0

for i in range(0,n):
    if int(list1[i]) <= int(list2[i]):
        sum += 1

print(sum)