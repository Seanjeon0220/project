sum = int(input())

while(True):
    first = input()
    if first == "=":
        print(sum)
        break
    second = int(input())
    if first == "+":
        sum += second
    elif first == "-":
        sum -= second
    elif first == "*":
        sum *= second
    elif first == "/":
        sum = sum//second
    