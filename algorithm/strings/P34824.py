N = int(input())

for i in range(N):
    str = input()
    if str == "yonsei":
        ycnt = i
    if str == "korea":
        kcnt = i
if ycnt > kcnt:
    print("Yonsei Lost...")
else:
    print("Yonsei Won!")