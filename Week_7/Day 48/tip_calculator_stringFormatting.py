food_amount = float(input("Enter the food amount: "))
tip_percentage = float(input("Enter the tip percenatge : ")) / 100
tip_amount = food_amount * tip_percentage
total = food_amount+tip_amount
print(f'The food amount is {food_amount}')
print(f'The tip amount is {tip_amount}')
print(f'The total amount is {total}')