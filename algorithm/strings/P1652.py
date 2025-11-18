n=int(input())
room=[]
empty_check=0
sum_num1=0
sum_num2=0
for a in range(0,n):
    k=input()
    room.append(k+'X')
room.append('X'*(n+1))

for i in range(0,len(room)):
    for p in range(0,len(room)):
        if room[i][p]==".":
            empty_check=empty_check+1
        else:
            if empty_check>=2:
                sum_num1+=1
            empty_check=0
empty_check=0
for i in range(0,len(room)):
    for p in range(0,len(room)):
        if room[p][i]==".":
            empty_check=empty_check+1
        else:
            if empty_check>=2:
                sum_num2+=1
            empty_check=0
print(sum_num1,sum_num2)