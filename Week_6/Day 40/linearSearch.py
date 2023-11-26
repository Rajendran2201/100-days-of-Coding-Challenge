def linear_search(arr, target):
    for i in range(len(arr)):
        if arr[i] == target:
            return i  

    return -1 


arr = [3, 6, 9, 12, 15, 18, 21, 24, 27, 30]
target = 18
result = linear_search(arr, target)

if result != -1:
    print(f"Element found at index {result}")
else:
    print("Element not found in the array")
