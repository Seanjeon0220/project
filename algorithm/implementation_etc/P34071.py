N = int(input())
li = []

for i in range(N):
    temp = int(input())
    li.append(temp)

check = li[0]

li.sort()

if li[0] == check:
    print("ez")
elif li[-1] == check:
    print("hard")
else:
    print("?")