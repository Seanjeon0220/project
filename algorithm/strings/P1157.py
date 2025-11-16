num=input()
sum_a=0
sum_b=0
sum_c=0
sum_d=0
sum_e=0
sum_f=0
sum_g=0
sum_h=0
sum_i=0
sum_j=0
sum_k=0
sum_l=0
sum_m=0
sum_n=0
sum_o=0
sum_p=0
sum_q=0
sum_r=0
sum_s=0
sum_t=0
sum_u=0
sum_v=0
sum_w=0
sum_x=0
sum_y=0
sum_z=0

num=num.upper()
for a in num:
    if a=="A":
        sum_a=sum_a+1
    if a=="B":
        sum_b=sum_b+1
    if a=="C":
        sum_c=sum_c+1
    if a=="D":
        sum_d=sum_d+1
    if a=="E":
        sum_e=sum_e+1
    if a=="F":
        sum_f=sum_f+1
    if a=="G":
        sum_g=sum_g+1
    if a=="H":
        sum_h=sum_h+1
    if a=="I":
        sum_i=sum_i+1
    if a=="J":
        sum_j=sum_j+1
    if a=="K":
        sum_k=sum_k+1
    if a=="L":
        sum_l=sum_l+1
    if a=="M":
        sum_m=sum_m+1
    if a=="N":
        sum_n=sum_n+1
    if a=="O":
        sum_o=sum_o+1
    if a=="P":
        sum_p=sum_p+1
    if a=="Q":
        sum_q=sum_q+1
    if a=="R":
        sum_r=sum_r+1
    if a=="S":
        sum_s=sum_s+1
    if a=="T":
        sum_t=sum_t+1
    if a=="U":
        sum_u=sum_u+1
    if a=="V":
        sum_v=sum_v+1
    if a=="W":
        sum_w=sum_w+1
    if a=="X":
        sum_x=sum_x+1
    if a=="Y":
        sum_y=sum_y+1
    if a=="Z":
        sum_z=sum_z+1

list0=[sum_a,sum_b,sum_c,sum_d,sum_e,sum_f,sum_g,sum_h,sum_i,sum_j,sum_k,sum_l,sum_m,sum_n,sum_o,sum_p,sum_q,sum_r,sum_s,sum_t,sum_u,sum_v,sum_w,sum_x,sum_y,sum_z]
max0=0
for p in range(0,len(list0)):
    if list0[p]>max0:
        max0=list0[p]
        
list0_max_index=[]
for q in range(0,len(list0)):
    if list0[q]==max0:
        list0_max_index.append(q)

if len(list0_max_index)==1:
    if list0_max_index[0]==0:
        print("A")
    if list0_max_index[0]==1:
        print("B")
    if list0_max_index[0]==2:
        print("C")
    if list0_max_index[0]==3:
        print("D")
    if list0_max_index[0]==4:
        print("E")
    if list0_max_index[0]==5:
        print("F")
    if list0_max_index[0]==6:
        print("G")
    if list0_max_index[0]==7:
        print("H")
    if list0_max_index[0]==8:
        print("I")
    if list0_max_index[0]==9:
        print("J")
    if list0_max_index[0]==10:
        print("K")
    if list0_max_index[0]==11:
        print("L")
    if list0_max_index[0]==12:
        print("M")
    if list0_max_index[0]==13:
        print("N")
    if list0_max_index[0]==14:
        print("O")
    if list0_max_index[0]==15:
        print("P")
    if list0_max_index[0]==16:
        print("Q")
    if list0_max_index[0]==17:
        print("R")
    if list0_max_index[0]==18:
        print("S")
    if list0_max_index[0]==19:
        print("T")
    if list0_max_index[0]==20:
        print("U")
    if list0_max_index[0]==21:
        print("V")
    if list0_max_index[0]==22:
        print("W")
    if list0_max_index[0]==23:
        print("X")
    if list0_max_index[0]==24:
        print("Y")
    if list0_max_index[0]==25:
        print("Z")
else:
    print("?")