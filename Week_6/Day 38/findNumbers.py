'''Write a Python program to find a list of integers with exactly two occurrences of nineteen and at least three occurrences of five. Return True otherwise False.
Input:
[19, 19, 15, 5, 3, 5, 5, 2]
Output:
True
Input:
[19, 15, 15, 5, 3, 3, 5, 2]
Output:
False
Input:
[19, 19, 5, 5, 5, 5, 5]
Output:
True'''

def countNineteen(mylist):
    count = 0
    for i in range(0,len(mylist)):
        if(mylist[i]==19):
            count+=1
    return count
def countFive(mylist):
    count = 0
    for i in range(0,len(mylist)):
        if(mylist[i]==5):
            count+=1
    return count
mylist=[3,4,5,3,5,5,2,5,19,23,19]
count1 = countNineteen(mylist)
count2 = countFive(mylist)
if((count1>=2) and (count2>=3)):
    print("True")
else:
    print("False")
    
    
    
    
    
    
    
    
