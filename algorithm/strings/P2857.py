list = [] 
for i in range(1, 6): 
    w = input() 
    if "FBI" in w: 
        list.append(i) 
if list: 
    print(*list) 
else: 
    print("HE GOT AWAY!")