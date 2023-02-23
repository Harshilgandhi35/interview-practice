#no of char in longest word
# sun flower is nice => so o/p is flower having length 6
str = input("enter the string : ")
max_length = 1
str = str.split(" ")#gives the list of words in the string
for i in str:
    if len(i) > max_length:
        max_length = len(i)
        word = i
print("word is ",word," "," length is ",max_length)