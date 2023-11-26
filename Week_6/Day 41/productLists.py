def multiply_lists(list1, list2):
    if len(list1) != len(list2):
        return "Lists must be of the same length"

    result = []
    for i in range(len(list1)):
        result.append(list1[i] * list2[i])

    return result

list_a = [1, 2, 3, 4, 5]
list_b = [6, 7, 8, 9, 10]

product_list = multiply_lists(list_a, list_b)
print(f"The product of the two lists is: {product_list}")
