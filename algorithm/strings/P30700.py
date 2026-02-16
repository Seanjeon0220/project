str = input()
kor = ["K","O","R","E","A"]
l = 0

for i in range(len(str)):
    if str[i] == kor[l%5]:
        l += 1
print(l)