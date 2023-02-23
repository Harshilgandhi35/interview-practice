#no of odd and even no in the list
n = int(input("how many no in the list : "))
listn=[]
count_odd=0
count_even=0
for i in range(n):
    b = int(input("enter : "))
    listn.append(b)

for j in listn:
    if j%2==0:
        count_even = count_even+1
    else:
        count_odd=count_odd+1
print("no of odd no are : ",count_odd)
print("no of even no are : ",count_even)