#  2 WAP to find whether string is palindrome or not. 
#  D-3

s = input("Enter a string: ")

# this is slicing of string which reverses the string by -1 step where 
# [::-1] means start to end with -1 step

r = s[::-1]

if s==r:
    print("Palindrome")
else:   
    print("Not a Palindrome")