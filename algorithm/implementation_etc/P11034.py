while True:
    try: 
        one, two, three = map(int, input().split(" "))
        ans = max(two-one,three-two)
        print(ans - 1)
    except:
        break