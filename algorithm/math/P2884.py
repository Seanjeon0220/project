time=input()
time=time.split(" ")
if int(time[1])>=45:
    time=[int(time[0]),int(time[1])-45]
else:
    time=[int(time[0])-1,15+int(time[1])]
    if time[0]<0:
        time[0]=24+int(time[0])

print(time[0],time[1])