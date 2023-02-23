#GCD
n = int(input("enter any number 1 : "))
m = int(input("enter any number 2 : "))
fact1=[]
fact2=[]
for i in range(1,n+1):
    if n % i == 0:
        fact1.append(i)

for i in range(1,m+1):
    if m%i==0:
        fact2.append(i)
multi=1
mul=[]
for i in fact1:
    for j in fact2:
        if i == j:
            mul.append(i)
for m in mul:
    if m > multi:
        multi = m

print(multi)

