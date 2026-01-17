N, M, S = map(int, input().split(" "))

pm = S*M
pn = (S*(100-N)/100)*(M+1)

print(int(min(pn,pm)))