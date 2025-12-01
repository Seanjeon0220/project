# 2108

import sys

cl=[]
sum0=0
n=int(input())
for i in range(0,n):
    a=sys.stdin.readline().split()
    cl.append(int(a[0]))
    sum0+=int(a[0])

cl.sort()
x=int((n+1)/2)-1
mode1=-4001
mode_num=0
cur=-4001
cur_num=0
mode2=-4002
mode2_exist=False
for i in range(0,len(cl)):
    if cur==cl[i]:
        cur_num+=1
        if cur_num==mode_num:
            if mode2_exist==False:
                mode2=cl[i]
                mode2_exist=True
        elif cur_num>mode_num:
            mode1=cl[i]
            mode_num=cur_num
            mode2_exist=False
    else:
        cur_num=1
        if cur_num==mode_num:
            if mode2_exist==False:
                mode2=cl[i]
                mode2_exist=True
        elif cur_num>mode_num:
            mode1=cl[i]
            mode_num=cur_num 
    cur=cl[i]
    
if mode2_exist==True:
    mode=mode2
else:
    mode=mode1
    
mean=round(sum0/n)
median=cl[x]
dom=cl[-1]-cl[0]

print(mean)
print(median)
print(mode)
print(dom)