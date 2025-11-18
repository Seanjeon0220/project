first = input()
second = input()
third = input()


if first.isdigit():
    temp = int(first) + 3
elif second.isdigit():
    temp = int(second) + 2
elif third.isdigit():
    temp = int(third) + 1

if temp%3 == 0 and temp%5 == 0:
    print("FizzBuzz")
elif temp%3 == 0:
    print("Fizz")
elif temp%5 == 0:
    print("Buzz")
else:
    print(temp)