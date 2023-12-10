def double(numbers: list) -> list:
    result = []
    for number in numbers:
       result.append(2*number)
    return result



counter = 1
while counter<10:
    print(counter)
    counter += 1

raj = 'sitting'
count = 0
while raj != 'standing':
    if count>2:
        raj = 'standing'
    print("get up bro !")
    count += 1

numbers = [2,3,4,5]
double_numbers = double(numbers)
print(double_numbers)