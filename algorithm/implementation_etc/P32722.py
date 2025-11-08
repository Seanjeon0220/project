def check(a,b,c):
    if a == 1 or a == 3:
        if b == 6 or b == 8:
            if c == 2 or c == 5:
                return "JAH"
    return "EI"


a = int(input())
b = int(input())
c = int(input())

print(check(a,b,c))