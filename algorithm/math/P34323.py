N, M, S = map(int, input().split(" "))

pm = S*M
pn = S*(M+1)*(100-N)//100

print((min(pn,pm)))