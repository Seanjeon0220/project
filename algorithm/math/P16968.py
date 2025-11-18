n=input()
result_list=[]

for i in range(0,len(n)):
    result_list.append(n[i])

result_num=1

if len(result_list)==4:
    if result_list[0]=="c":
        result_num=result_num*26
        if result_list[1]=="c":
            result_num=result_num*25
            if result_list[2]=="c":
                result_num=result_num*25
                if result_list[3]=="c":
                    result_num=result_num*25
                else:
                    result_num=result_num*10
            else:
                result_num=result_num*10
                if result_list[3]=="c":
                    result_num=result_num*26
                else:
                    result_num=result_num*9
        else:
            result_num=result_num*10
            if result_list[2]=="c":
                result_num=result_num*26
                if result_list[3]=="c":
                    result_num=result_num*25
                else:
                    result_num=result_num*10
            else:
                result_num=result_num*9
                if result_list[3]=="c":
                    result_num=result_num*26
                else:
                    result_num=result_num*9
    else:
        result_num=result_num*10
        if result_list[1]=="c":
            result_num=result_num*26
            if result_list[2]=="c":
                result_num=result_num*25
                if result_list[3]=="c":
                    result_num=result_num*25
                else:
                    result_num=result_num*10
            else:
                result_num=result_num*10
                if result_list[3]=="c":
                    result_num=result_num*26
                else:
                    result_num=result_num*9
        else:
            result_num=result_num*9
            if result_list[2]=="c":
                result_num=result_num*26
                if result_list[3]=="c":
                    result_num=result_num*25
                else:
                    result_num=result_num*10
            else:
                result_num=result_num*9
                if result_list[3]=="c":
                    result_num=result_num*26
                else:
                    result_num=result_num*9
elif len(result_list)==3:
    if result_list[0]=="c":
        result_num=result_num*26
        if result_list[1]=="c":
            result_num=result_num*25
            if result_list[2]=="c":
                result_num=result_num*25
            else:
                result_num=result_num*10
        else:
            result_num=result_num*10
            if result_list[2]=="c":
                result_num=result_num*26
            else:
                result_num=result_num*9
    else:
        result_num=result_num*10
        if result_list[1]=="c":
            result_num=result_num*26
            if result_list[2]=="c":
                result_num=result_num*25
            else:
                result_num=result_num*10
        else:
            result_num=result_num*9
            if result_list[2]=="c":
                result_num=result_num*26
            else:
                result_num=result_num*9

elif len(result_list)==2:
    if result_list[0]=="c":
        result_num=result_num*26
        if result_list[1]=="c":
            result_num=result_num*25
        else:
            result_num=result_num*10
    else:
        result_num=result_num*10
        if result_list[1]=="c":
            result_num=result_num*26
        else:
            result_num=result_num*9

else:
    if result_list[0]=="c":
        result_num=26
    else:
        result_num=10


print(result_num)