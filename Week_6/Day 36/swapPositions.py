'''Given a list in Python and provided the positions of the elements, write a program to swap the two elements in the list. 

Examples:  

Input : List = [23, 65, 19, 90], pos1 = 1, pos2 = 3
Output : [19, 65, 23, 90]

Input : List = [1, 2, 3, 4, 5], pos1 = 2, pos2 = 5
Output : [1, 5, 3, 4, 2]

'''
def swap(mylist,pos1,pos2):
    temp = mylist[pos1]
    mylist[pos1]=mylist[pos2]
    mylist[pos2]=temp
    return mylist
mylist=[3,4,6,7,3,9,5,8,3,9,5]
pos1 =int(input("Enter the position-1:"))
pos2 = int(input("Enter the position-2:"))
print(swap(mylist,pos1,pos2))
