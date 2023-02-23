#minimum and maximum from the list
def MinMax(listn):
    #using built-in function
    # print("max no is : ",max(listn))
    # print("max no is : ",min(listn))
    #using own logic
    min=listn[0]
    max=listn[0]
    for i in listn:
        if i > max:
            max = i
        elif i<min:
            min = i
    print("max is : ",max)
    print("min is : ",min)

n = int(input("how many no in the list : "))
listn=[]
for i in range(n):
    b = int(input("enter : "))
    listn.append(b)

MinMax(listn)
