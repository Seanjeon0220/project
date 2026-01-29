N = int(input())

for i in range(N):
    t = int(input())
    if t%25 < 17:
        print("ONLINE")
    else:
        print("OFFLINE")