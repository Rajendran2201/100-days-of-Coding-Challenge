#ARRAYS -> lists in python
# The index value of a list starts with 0 and goes up to len(n)-1
#Reverse indexing is also possible in python
numbers = [10,101,10,10,10]
print(numbers)
numbers[2] = 4
print(numbers)
numbers[3] = 6
numbers.append(8)
print(numbers)
fruits = ['mango','orange','apple','grapes']
print(fruits)
for i in fruits:
    print(i)
vegetables = ['🍆','🍐','🥕','🍅']
for i in vegetables:
    print(i)
vegetables.append(7)
print(vegetables)
fruits.append(45)
print(fruits)
fruits.append(95.4)
print(fruits)
print(vegetables[-1])
print(vegetables[-2])