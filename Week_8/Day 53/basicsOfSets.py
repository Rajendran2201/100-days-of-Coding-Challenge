'''
unique(['ruby','python','ruby'])
['ruby','python']  // returns a list
'''
def unique(languages): return list(set(languages))
# unique = lambda languages :  list(set(languages))   // using lambda functions
print(unique(['ruby','python','ruby']))