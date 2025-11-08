sentence = input()
one = ["A","a","b","D","d","e","g","O","o","P","p","Q","q","R","@"]
two = ["B"]
sum = 0

for i in range(len(sentence)):
    temp = sentence[i:i+1]
    if temp in one:
        sum +=1
    elif temp in two:
        sum +=2

print(sum)