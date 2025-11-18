def lunar(n):
    if n%400==0:
        return True
    elif n%4==0 and n%100!=0:
        return True
    else:
        return False
    
def cal(day,hour,minute):
    minsum=1440*(day-1)+60*hour+minute
    return minsum


whole=input()
whole1=whole.split(" ")
whole1[1]=int(whole1[1].replace(",",""))
whole1[2]=int(whole1[2])
whole1[3]=whole1[3].split(":")
whole1[3][0]=int(whole1[3][0])
whole1[3][1]=int(whole1[3][1])

if lunar(whole1[2])==True:
    if whole1[0]=="January":
        sum1=cal(whole1[1],whole1[3][0],whole1[3][1])
    if whole1[0]=="February":
        sum1=cal(whole1[1],whole1[3][0],whole1[3][1])+44640
    if whole1[0]=="March":
        sum1=cal(whole1[1],whole1[3][0],whole1[3][1])+44640+41760
    if whole1[0]=="April":
        sum1=cal(whole1[1],whole1[3][0],whole1[3][1])+44640+41760+44640
    if whole1[0]=="May":
        sum1=cal(whole1[1],whole1[3][0],whole1[3][1])+44640+41760+44640+43200
    if whole1[0]=="June":
        sum1=cal(whole1[1],whole1[3][0],whole1[3][1])+44640+41760+44640+43200+44640
    if whole1[0]=="July":
        sum1=cal(whole1[1],whole1[3][0],whole1[3][1])+44640+41760+44640+43200+44640+43200
    if whole1[0]=="August":
        sum1=cal(whole1[1],whole1[3][0],whole1[3][1])+44640+41760+44640+43200+44640+43200+44640
    if whole1[0]=="September":
        sum1=cal(whole1[1],whole1[3][0],whole1[3][1])+44640+41760+44640+43200+44640+43200+44640+44640
    if whole1[0]=="October":
        sum1=cal(whole1[1],whole1[3][0],whole1[3][1])+44640+41760+44640+43200+44640+43200+44640+44640+43200
    if whole1[0]=="November":
        sum1=cal(whole1[1],whole1[3][0],whole1[3][1])+44640+41760+44640+43200+44640+43200+44640+44640+43200+44640
    if whole1[0]=="December":
        sum1=cal(whole1[1],whole1[3][0],whole1[3][1])+44640+41760+44640+43200+44640+43200+44640+44640+43200+44640+43200
    print(sum1*100/(366*24*60))
    
else:
    if whole1[0]=="January":
        sum1=cal(whole1[1],whole1[3][0],whole1[3][1])
    if whole1[0]=="February":
        sum1=cal(whole1[1],whole1[3][0],whole1[3][1])+44640
    if whole1[0]=="March":
        sum1=cal(whole1[1],whole1[3][0],whole1[3][1])+44640+41760-1440
    if whole1[0]=="April":
        sum1=cal(whole1[1],whole1[3][0],whole1[3][1])+44640+41760+44640-1440
    if whole1[0]=="May":
        sum1=cal(whole1[1],whole1[3][0],whole1[3][1])+44640+41760+44640+43200-1440
    if whole1[0]=="June":
        sum1=cal(whole1[1],whole1[3][0],whole1[3][1])+44640+41760+44640+43200+44640-1440
    if whole1[0]=="July":
        sum1=cal(whole1[1],whole1[3][0],whole1[3][1])+44640+41760+44640+43200+44640+43200-1440
    if whole1[0]=="August":
        sum1=cal(whole1[1],whole1[3][0],whole1[3][1])+44640+41760+44640+43200+44640+43200+44640-1440
    if whole1[0]=="September":
        sum1=cal(whole1[1],whole1[3][0],whole1[3][1])+44640+41760+44640+43200+44640+43200+44640+44640-1440
    if whole1[0]=="October":
        sum1=cal(whole1[1],whole1[3][0],whole1[3][1])+44640+41760+44640+43200+44640+43200+44640+44640+43200-1440
    if whole1[0]=="November":
        sum1=cal(whole1[1],whole1[3][0],whole1[3][1])+44640+41760+44640+43200+44640+43200+44640+44640+43200+44640-1440
    if whole1[0]=="December":
        sum1=cal(whole1[1],whole1[3][0],whole1[3][1])+44640+41760+44640+43200+44640+43200+44640+44640+43200+44640+43200-1440
    print(sum1*100/(365*24*60))