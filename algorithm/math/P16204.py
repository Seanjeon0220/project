N, M, K = map(int, input().split())

sum = min(M,K) + min(N-M,N-K)


print(sum)