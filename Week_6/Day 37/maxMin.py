def maxima(mylist,size):
    maximum = mylist[0]
    for i in range(0,size):
        if(maximum<mylist[i]):
            maximum = mylist[i]
    return maximum
def minima(mylist,size):
    minimum=mylist[0]
    for i in range(0,size):
        if(minimum>mylist[i]):
            minimum = mylist[i]
    return minimum
mylist = [2,3,5,6,-9,-34,54,65]
maximum = maxima(mylist,len(mylist))
minimum = minima(mylist, len(mylist))
print("The maximum value in the list is ",maximum)
print("The minimum value in the list is ",minimum)
    
