def lcm(a,b):
    result=[]
    for i in range(1,int(a*b)+1):
        if i%a==0 and i%b==0:
            result.append(i)
    return min(result)


def gcd(a,b):
    result=[]
    c=max(a,b)
    for i in range(1,c+1):
        if a%i==0 and b%i==0:
            result.append(i)
    return max(result)


n=int(input())

for i in range(0,n):
    k=input().split(" ")
    a=int(k[0])
    b=int(k[1])
    print(int(lcm(a,b)), int(gcd(a,b)))