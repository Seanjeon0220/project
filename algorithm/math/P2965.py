A,B,C = map(int, input().split(" "))

temp = max(B-A,C-B)

print(temp-1)