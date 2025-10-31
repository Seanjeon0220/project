chill = {"Poblano":1500, "Mirasol":6000, "Serrano":15500,"Cayenne":40000,"Thai":75000,"Habanero":125000}

N = int(input())
ans =0

for i in range(N):
    tmp = input()
    ans += chill[tmp]
print(ans)