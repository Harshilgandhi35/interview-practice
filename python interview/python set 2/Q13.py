#fuction to find factorial of a no
def factorial(n):
    ans = 1
    while n>0:
        ans = ans*n
        n=n-1
    return ans  


n = int(input("enter any number : "))
if n < 0:
    print("not a valid number")
elif n == 0:
    print('1')
else:
    print(factorial(n))