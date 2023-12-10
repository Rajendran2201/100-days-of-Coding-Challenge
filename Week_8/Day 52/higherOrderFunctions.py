# map()
def double(number):
    return 2*number

print(list(map(lambda num : num*2,[4,4,5])))
print(list(map(lambda num : num**2,[4,4,5])))

#filter()
numbers = [1,2,3,4,5,6,7,8,9,10,11,12]
print("Odd numbers : ",list(filter(lambda number: number%2,numbers)))
print("Even numbers : ",list(filter(lambda number: number%2==0,numbers)))

