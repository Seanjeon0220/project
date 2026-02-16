def god(str):
    ans = ""
    str[0] = "god"
    for i in str:
        ans += i
    return ans

N = int(input())

for _ in range(N):
    str = list(input().split(" "))
    print(god(str))
