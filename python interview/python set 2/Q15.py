#palindrome check
def CheckPalindromeNo(n):
    if str(n) == str(n)[::-1]:
        return True
    else:
        return False

n = int(input("enter any no : "))
if CheckPalindromeNo(n) == True:
    print("yes")
else:
    print("no")