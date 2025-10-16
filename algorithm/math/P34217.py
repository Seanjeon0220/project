A, B = map(int, input().split())
C, D = map(int, input().split())

h = A+C
y = B+D

if h < y:
    print("Hanyang Univ.")
elif y < h:
    print("Yongdap")
else:
    print("Either")