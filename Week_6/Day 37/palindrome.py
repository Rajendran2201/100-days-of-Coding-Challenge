def findPalindrome(string):
    start=0
    end=len(string)-1
    while(start<end):
        if(string[start]!=string[end]):
            return False
        start+=1
        end-=1
    return True
string = input("Enter the string:")
ans = findPalindrome(string)
if(ans):
    print("The string is a palindrome")
else:
    print("The string is not a palindorme")
