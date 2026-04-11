c = int(input())

while(True):
    n = int(input())

    if n == 0:
        break

    if n%c != 0:
        print("{} is NOT a multiple of {}.".format(n,c))
    else:
        print("{} is a multiple of {}.".format(n,c))