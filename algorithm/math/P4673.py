def d(n):
    if n<10:
        n=2*n
    elif n>=10 and n<100:
        n=(n//10)*11+(n%10)*2
    elif n>=100 and n<1000:
        n=(n//100)*101+((n%100)//10)*11+(n%10)*2
    elif n>=1000 and n<10000:
        n= (n//1000)*1001+((n%1000)//100)*101+((n%100)//10)*11+(n%10)*2
    return n

none=[]
new=set()
for i in range(1,10000):
    none.append(d(i))
for j in range(0,len(none)):
    if none[j]<=10000:
        new.add(none[j])

standard=[]
for k in range(1,10001):
    standard.append(k)

for p in new:
    standard.remove(p)
    result=standard

for q in result:
    print(q)