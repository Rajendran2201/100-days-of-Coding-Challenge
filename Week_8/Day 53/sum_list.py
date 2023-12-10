def sum_list(list_in : list) -> int:
    sum = 0
    for i in list_in:
        sum += i
    return sum
my_list = [1,2,3,4]
print("The sum of the elements is ",sum_list(my_list))

