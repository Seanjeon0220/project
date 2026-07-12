def dfs(begin):
    past[begin] = True
    if not past[graph[begin]]:
        dfs(graph[begin])

N = int(input())

graph = [0]
ans = [0]

for _ in range(N):
    temp = int(input())
    graph.append(temp)

for i in range(N):
    past = [False]*(N+1)
    dfs(i+1)
    ans.append(past.count(True))

final = ans.index(max(ans))
print(final)