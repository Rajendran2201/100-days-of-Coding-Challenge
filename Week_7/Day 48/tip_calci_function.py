#Defining the function findTotalAmount()
'''

    :param food_amount: float : Takes the bill of the food ate by the customer
    :param tip_percenatge: float : Takes the tip percenatge of the bill
    :return: Integer : total amount to be paid
    '''
def findTotalAmount(food_amount, tip_percentage):

    tip_percent = tip_percentage / 100
    tip_amount = food_amount*tip_percent
    return tip_amount+food_amount
def hello():
    #This function can be defined later
    pass

hello()
food_amount = float(input("Enter the food amount : $"))
tip_percentage = float(input("Enter the tip percenatge: $"))

#Calling the function
total = findTotalAmount(food_amount,tip_percentage)
print(f'The total amount to be paid is ${total}')

