sen=input()
sen=sen.split(" ")
num=len(sen)
if sen[0]==(""):
    num=num-1
if sen[-1]==(""):
    num=num-1
print(num)