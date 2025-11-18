str = input()
sum = 0

is_even = False

for i in range(len(str)):
    if str[i] == '*':
        if i % 2 != 0:
            is_even = True
        continue
    sum += int(str[i]) * (1 if i % 2 == 0 else 3)

if is_even == True:
    for i in range(10):
        if (sum + (i * 3)) % 10 == 0:
            print(i)
            break
else:
    print(10 - sum % 10)