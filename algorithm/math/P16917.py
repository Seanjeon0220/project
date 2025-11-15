fi=list(map(int, input().split()))
A=fi[0]
B=fi[1]
C=fi[2]
x=fi[3]
y=fi[4]

if A+B>C*2:
    if x>=y:
        print(min((2*y*C+(x-y)*A),(2*x*C)))
    else:
        print(min((2*x*C+(y-x)*B),(2*y*C)))

# elif C<=A and C<=B:
#     if x>=y:
#         print(2*y*C+(x-y)*A)
#     else:
#         print(2*x*C+(y-x)*B)

else:
    print(x*A+y*B)
