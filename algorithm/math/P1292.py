num_list=[0]
for p in range(1,45):
    for q in range(1,p+1):
        num_list.append(p)        
num_list.append(45)
num_list.append(45)
num_list.append(45)
num_list.append(45)
num_list.append(45)
num_list.append(45)
num_list.append(45)
num_list.append(45)
num_list.append(45)
num_list.append(45)

a=input()
b=a.split(" ")

num_process=num_list[int(b[0]):int(b[1])+1:1]
sum0=0
for i in num_process:
    sum0+=i
print(sum0)