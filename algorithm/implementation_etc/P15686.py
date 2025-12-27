from itertools import combinations

def distance(a,b):
    x=abs(a[0]-b[0])
    y=abs(a[1]-b[1])
    return x+y
    

n, m = map(int,input().split())

fi = list(list(map(int, input().split())) for _ in range(n)) 

    
Chicken=[]
House=[]

for i in range(n):
    for j in range(n):
        if fi[i][j]==2:
            Chicken.append([i, j])
        elif fi[i][j]==1:
            House.append([i, j])

pick_chicken = list(combinations(Chicken,m))

sum=0
result = [0]*len(pick_chicken)

for i in House:
    for j in range(len(pick_chicken)):

        A = 101

        for k in pick_chicken[j]:
            temp = distance(i,k)
            A = min(A,temp)

        result[j] += A

print(min(result))
