N = int(input().strip())
fruitList = list(map(int, input().split(" ")))

l = 0
f_cnt = {}
max_len = 0

for r in range(N):
    temp = fruitList[r]
    
    if temp in f_cnt:
        f_cnt[temp] += 1
    else:
        f_cnt[temp] = 1
    
    while len(f_cnt) > 2:
        eli = fruitList[l]
        f_cnt[eli] -= 1
        if f_cnt[eli] == 0:
            del f_cnt[eli]
        l += 1
    max_len = max(max_len, r-l+1)
print(max_len)