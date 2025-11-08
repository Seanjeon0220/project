A, B = map(int, input().split())

aa = (A-1)//4
aaa = (A-1)%4
bb = (B-1)//4
bbb = (B-1)%4

ans = abs(aa-bb) + abs(aaa-bbb)

print(ans)