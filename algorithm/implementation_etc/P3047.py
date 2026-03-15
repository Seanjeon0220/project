num = sorted(list(map(int, input().split(" "))))

d = {"A":num[0],"B":num[1],"C":num[2]}

a,b,c = list(input())

print(d[a],d[b],d[c])