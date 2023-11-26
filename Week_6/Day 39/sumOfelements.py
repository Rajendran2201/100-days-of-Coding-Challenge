'''
Write a Python program to check a given list of integers where the sum of the first i integers is i.
Input:
[0, 1, 2, 3, 4, 5]
Output:
False
Input:
[1, 1, 1, 1, 1, 1]
Output:
True
Input:
[2, 2, 2, 2, 2]
Output:
False
'''
mylist = []
noOfelements = int(input("Enter the number of elements: "))
for i in range(0,noOfelements):
    num = int(input("Enter the element : "))
    mylist.append(num)
sum=0
count = 0
for i in range(0,noOfelements):
    sum+=mylist[i]
    if((i+1)!=sum):
        count+=1
if(count):
    print("False")
else:
    print("True")
    
    
