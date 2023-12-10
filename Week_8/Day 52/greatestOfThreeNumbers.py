def greatest_of_three_numbers(num1,num2,num3):
    if(num1>num2 and num1>num3):
        greatest = num1
    elif(num2>num1 and num2>num3):
        greatest = num2
    else:
        greatest = num3
    return greatest

num1 = int(input("Enter number-1: "))
num2 = int(input("Enter number-2: "))
num3 = int(input("Enter number-3: "))
greatest = greatest_of_three_numbers(num1,num2,num3)
print(f"The greatest of {num1} , {num2} and {num3} is {greatest}")