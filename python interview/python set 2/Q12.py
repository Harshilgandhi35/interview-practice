#sum of all elements in the list
def sumList(listn):
   
    #using own logic
    sum = 0
    for i in listn:
        sum = sum + i
    return sum

n = int(input("how many no in the list : "))
listn=[]
for i in range(n):
    b = int(input("enter : "))
    listn.append(b)
#using built-in function
print("sum of all elements is : ",sum(listn))
result = sumList(listn)
print("using own logic sum is : ",result)