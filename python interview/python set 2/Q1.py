#number is poer of 2
n = int(input("enter any number : "))
i = n
if i > 0:
    while i%2==0:
        i=i//2
if i==1:
    print("it is power of two")
else:
    print("it is not power of two")