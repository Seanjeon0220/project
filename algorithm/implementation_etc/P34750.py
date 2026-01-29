N = int(input())

if N >= 1000000:
    give = N*0.2
elif N >= 500000:
    give = N*0.15
elif N >= 100000:
    give = N*0.1
else:
    give = N*0.05

print(int(give), int(N-give))