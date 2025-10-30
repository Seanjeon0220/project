n = int(input())

for i in range(n):
    temp = input()
    if temp[-1] == ".":
        print(temp)
    else:
        print(temp+".")
        