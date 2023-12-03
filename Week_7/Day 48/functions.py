def say_my_name():
    print("Raj")


    '''

    :param greet: takes a greeting message
    :param name: takes the name of the user
    :return: nothing (prints a statement)

    Example :  say_my_name2('hello','Qazi')
    hello , Qazi
    '''

def say_my_name2(greet,name):

    print(f'{greet} , {name}')

def greeting(name,greet = 'Hello'):
    print(f'{greet} , {name}')
#say_my_name()
#say_my_name2('hello','Qazi')
#greeting("Raj");

#named Arguments
    '''
    :param a: operand-1
    :param b: operand-2
    :return: returns the sum of the operands

    Example: sum(7,3) returns 10
    '''
def sum(a,b):
    return a+b

greeting(greet = 'Aloha', name='Rishu' )
ans=sum(3,6)

print(ans)

