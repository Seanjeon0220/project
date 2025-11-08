def check(r, f):
    if r<= f:
        return "high speed rail"
    if r<=240:
        return "high speed rail"
    return "flight"



rail = int(input())

ma, fa, mb = map(int, input().split(" "))

fly = ma+fa+mb

print(check(rail, fly))