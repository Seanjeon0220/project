A, B, walk, need = map(int, input().split(" "))

ride = A+B 

if ride <= need:
    if walk <= need:
        print("~.~")
    else:
        print("Shuttle")
else:
    if walk <= need:
        print("Walk")
    else:
        print("T.T")