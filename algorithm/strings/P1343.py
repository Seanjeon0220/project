def board(temp):
    temp = temp.replace("XXXX", "AAAA")
    temp = temp.replace("XX", "BB")
    if 'X' in temp:
        return -1
    
    return temp

tmp = input()

print(board(tmp))