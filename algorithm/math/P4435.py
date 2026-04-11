t = int(input())

for i in range(1,t+1):
    g = list(map(int, input().split()))
    s = list(map(int, input().split()))

    gp = g[0]+g[1]*2+g[2]*3+g[3]*3+g[4]*4+g[5]*10
    sp = s[0]+s[1]*2+s[2]*2+s[3]*2+s[4]*3+s[5]*5+s[6]*10

    if gp > sp:
        print(f"Battle {i}: Good triumphs over Evil")
    elif gp < sp:
        print(f"Battle {i}: Evil eradicates all trace of Good")
    else:
        print(f"Battle {i}: No victor on this battle field")