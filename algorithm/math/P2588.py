A = int(input())
B = int(input())

C = B%10 * A
D = (B//10)%10 * A
E = B//100 * A
F = C + 10*D + 100*E

print(C)
print(D)
print(E)
print(F)