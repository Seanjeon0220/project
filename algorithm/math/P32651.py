def check(N):
    if N > 100000:
        return False
    if N%2024 != 0:
        return False
    return True


n = int(input())

if check(n):
    print("Yes")
else:
    print("No")