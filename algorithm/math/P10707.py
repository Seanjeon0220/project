A = int(input())
B = int(input())
C = int(input())
D = int(input())
P = int(input())

ans = min(A*P, B+(P>C)*max(P-C,0)*D)

print(ans)