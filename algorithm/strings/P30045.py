def check(str):
    for i in range(0,len(str)-1):
        if str[i:i+2] == "01" or str[i:i+2] == "OI":
            return True
    return False

N = int(input())
ans = 0

for i in range(N):
    s = input()
    if check(s):
        ans += 1
print(ans)