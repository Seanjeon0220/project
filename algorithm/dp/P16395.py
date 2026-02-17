pascal = [[1 for _ in range(i)] for i in range(1,31)]

for j in range(2,30):
    for p in range(1,j):
        pascal[j][p] = pascal[j-1][p-1] + pascal[j-1][p]

n,k = map(int, input().split(" "))

print(pascal[n-1][k-1])