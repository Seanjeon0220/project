N = int(input())

if N%3 == 0:
    ans = "S"
elif N%3 == 1:
    ans = "U"
else:
    ans = "O"

print(ans)