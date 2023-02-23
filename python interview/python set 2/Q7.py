#mode of the list of no
# def get_key(val,mode_dict):
#     for key, value in mode_dict.items():
#         if val == value:
#             return key
 
#     return "key doesn't exist"
# listn = []
# mode_dict = {}
# n = int(input("how many no in the list : "))
# for i in range(n):
#     b = int(input("enter : "))
#     listn.append(b)
# for k in listn:
#     mode_dict[k] = listn.count(k)

# print("mode is : ",get_key(max(mode_dict),mode_dict))

#2nd method
import statistics
listn = []
n = int(input("how many no in the list : "))
for i in range(n):
    b = int(input("enter : "))
    listn.append(b)
print("mode is ",statistics.mode(listn))