def findMax(my_list : list) -> int :
    max = my_list[0]
    for i in my_list:
        if i>max:
            max = i
    return max
my_list = [13,7,2,-5,-3,-7]
print(findMax(my_list))
