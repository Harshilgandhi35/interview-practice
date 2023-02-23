#sum of first n odd numbers
n = int(input("how many sum  of n odd no do you want : "))
sum = 0
for i in range(1,n*2):
    if i%2 != 0:
        sum=sum+i
print("sum of ",n," odd no is ",sum)