from collections import deque

def bfs(x):
    q = deque([x])
    visited[x] = 1
    M = 0

    while q:
        y = q.popleft()

        if graph[y] == K:
            return M+1
        next = graph[y]
        if not visited[next]:
            visited[next] = 1
            q.append(next)
            M += 1
    return -1
    
N,K = map(int,input().split(" "))
graph = []

for _ in range(N):
    temp = int(input())
    graph.append(temp)

visited = [0]*N

ans = bfs(0)

print(ans)