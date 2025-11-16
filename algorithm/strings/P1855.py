a=int(input())
p=input()
b=int(len(p)/a)
arr = [ [0] * a for _ in range(b) ]
j=0
for q in range(0,len(arr)):
    if q%2==0:
        for i in range(a):
            arr[q][i]=p[j]
            j=j+1
    else:
        for i in range(a-1,-1,-1):
            arr[q][i]=p[j]
            j=j+1
for a1 in range(a):
    for b1 in range(b):
        print(arr[b1][a1],end='')
        