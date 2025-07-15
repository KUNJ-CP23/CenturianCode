#1. WAP to find a sum of even number into 1D array
# D-3

n = int(input("Enter the number of elements in the array: "))

arr = []
print("Enter the elements:")
for _ in range(n):
    num = int(input())
    arr.append(num)

even_sum = 0
for num in arr:
    if num % 2 == 0:
        even_sum += num

print("Sum of even numbers =", even_sum)