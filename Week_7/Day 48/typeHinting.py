def weather_to_emoji(weather:str) -> None:
    if weather == 'rainy':
        print('☔️')
    elif weather == 'sunny':
        print('🌤️')
    elif weather == 'thunder':
        print('⛈')
def sumOfFloat(a:float,b:float) -> float:
    return a+b
def sum(a:int,b:int) -> int:
    return a+b

weather_to_emoji(weather='thunder')
print(sumOfFloat(2.3,4.5))
print(sum(7,3))