N = int(input())

cl = list(map(int, input().split()))

T, P = map(int, input().split())

a = 0

for i in cl:
    if i%T == 0:
        a += i//T
    else:
        a += i//T + 1

b = sum(cl)//P
c = sum(cl)%P

print(a)
print(b, c)