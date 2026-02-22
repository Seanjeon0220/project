def dps(N):
    if N == 1 or N == 3:
        return "CY"
    if N == 2:
        return "SK"
    
    dp[1] = "CY"
    dp[2] = "SK"
    dp[3] = "CY"

    for i in range(4,N+1):
        if dp[i-1] == "CY" or dp[i-3] == "CY":
            dp[i] = "SK"
        else:
            dp[i] = "CY"
    return dp[N]

N = int(input())

dp = [-1]*(N+1)
print(dps(N))