sum = lambda a,b : a+b;
'''
assert is used to check whether the function returns the correct output
in other words , assert is used to verify all the test cases
'''
assert sum(2,3) == 5, "sum(2,3) didn't returned the expected result, It should return 5"
assert sum(1,2) == 3 , "sum(1,2) didn't returned the expected result, It should return 3"
assert sum(-9,9) == 0
print(sum(20,3))