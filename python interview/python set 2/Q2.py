#binary to decimal

count = 0
sum=0
n = input("enter binary digit : ")
n = n[::-1]

listn = []
ones=[]
for i in n:
    listn.append(i)
print(listn)
for k in listn:
    if k == '1':
       count = count+1
       sum = sum + 2**(count-1)
    else:
        count=count+1
print(sum)
