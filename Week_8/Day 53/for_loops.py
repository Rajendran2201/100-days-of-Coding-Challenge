fruits = ['apple','mango','orange','banana','pomegranate']
for i in range(len(fruits)):    #for loop
    print(fruits[i])
for i in fruits:                #for each loop
    print(i)
print(list(enumerate(fruits)))
for fruit in enumerate(fruits):
    print(fruit[1],fruit[0])    # here 0 refers to the index whereas 1 refers the value stored in the index

for index,fruit in enumerate(fruits):
    print(index,fruit)