
'''  Problem Statement : Write a python code which takes a list as an input and swaps the first and last element of the list  '''

def swapList(List):
    temp = List[0]
    List[0]=List[len(List)-1]
    List[len(List)-1] = temp
    return List
myList = [1,2,3,4,5]
print(swapList(myList))
