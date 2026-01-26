N, M, A, B = map(int, input().split(" "))

need = N*3 - M

if need <= 0:
    print(0)
else:
    print(need*A+B)