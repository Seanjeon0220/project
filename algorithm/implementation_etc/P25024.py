def time(hour,minute):
    if (0<=hour and hour<=23) and (0<=minute and minute<=59):
        return "Yes"
    return "No"
    
def date(a,b):
    if a in [1,3,5,7,8,10,12]:
        if 1<=b and b<=31:
            return "Yes"
        else:
            return "No"
    elif a in [4,6,9,11]:
        if 1<=b and b <=30:
            return "Yes"
        else:
            return "No"
    elif a == 2:
        if 1<=b and b<=29:
            return "Yes"
        else:
            return "No"
    else:
        return "No"
        
N = int(input())

for _ in range(N):
    a,b = map(int, input().split(" "))
    print(time(a,b),date(a,b))