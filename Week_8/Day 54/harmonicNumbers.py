def findHarmonic(n):
    sum = 0
    for i in range(1,n+1):
        sum += 1/i
    return sum
n = int(input("Enter the value of n:"))
ans = findHarmonic(n)
print("The nth term of the harmonic sequence is ",ans)
