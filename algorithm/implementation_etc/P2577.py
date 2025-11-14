num1=int(input())
num2=int(input())
num3=int(input())
ulnum=num1*num2*num3

list0=[0,0,0,0,0,0,0,0,0,0]
list0[0]=str(ulnum).count("0")
list0[1]=str(ulnum).count("1")
list0[2]=str(ulnum).count("2")
list0[3]=str(ulnum).count("3")
list0[4]=str(ulnum).count("4")
list0[5]=str(ulnum).count("5")
list0[6]=str(ulnum).count("6")
list0[7]=str(ulnum).count("7")
list0[8]=str(ulnum).count("8")
list0[9]=str(ulnum).count("9")

for a in list0:
    print(a)