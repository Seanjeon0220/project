def fibonacci(n):
    if n == 0:
        store[0] = 0
        return 0
    if n == 1:
        store[1] = 1
        return 1
    if store[n] == 0:
        store[n] = fibonacci(n-1)+fibonacci(n-2)
    return store[n]

N = int(input())

store = []

for _ in range(50):
    store.append(0)
print(fibonacci(N))