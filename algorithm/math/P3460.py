T = int(input())

for _ in range(T):
    ans = []
    tmp = int(input())

    while tmp >= 1:
        ans.append(tmp%2)
        tmp = tmp //2 
    for i in range(len(ans)):
        if ans[i] == 1:
            print(i,end=" ")