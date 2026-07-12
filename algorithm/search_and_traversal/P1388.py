def dfs(x,y):
    if graph[x][y] == "-":
        graph[x][y] = 1
        for ystar in [1,-1]:
            Y = y + ystar
            if (Y > 0 and Y < M) and graph[x][Y] == "-":
                dfs(x,Y)
    if graph[x][y] == "|":
        graph[x][y] = 1
        for xstar in [1,-1]:
            X = x + xstar
            if (X>0 and X<N) and graph[X][y] == "|":
                dfs(X,y)

N,M = map(int, input().split(" "))

graph = []

for _ in range(N):
    temp = list(input())
    graph.append(temp)

ans = 0

for i in range(N):
    for j in range(M):
        if graph[i][j] == "-" or graph[i][j] == "|":
            dfs(i,j)
            ans += 1
print(ans)