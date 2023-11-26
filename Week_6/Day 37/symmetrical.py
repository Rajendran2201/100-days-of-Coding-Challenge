def findSymmetrical(string):
    start= 0
    end=len(string)//2
    while(end<len(string)):
        if(string[start]!=string[end]):
            return False
        start+=1
        end+=1
    return True
string=input("Enter the string: ");
flag = findSymmetrical(string)
if(flag):
    print("The given string is symmetrical")
else:
    print("The given string is not symmetrical")
