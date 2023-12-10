numbers = [1,2,3,4,5,6,7,8,9,10,11,12,13,14]
print("Odd numbers : ", [number for number in numbers if number%2==0])
print("Even numbers : ", [number for number in numbers if number%2])
print("Square numbers : ", [number**2 for number in numbers ])
print("Doubled numbers : ", [number*2 for number in numbers ])
print("Single Decremented numbers : ", [number-1 for number in numbers])
print("Double incremented numbers : ", [number+2 for number in numbers])
print("Multiples of three : ", [number for number in numbers if number%3 == 0])
