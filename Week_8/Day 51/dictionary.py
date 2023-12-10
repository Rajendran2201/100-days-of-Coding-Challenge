#lists and dictionaries are mutable
def introducer():
    person = {
        'name': 'raj',
        'shirt': 'black',
        'laptop': 'apple',
        'assets': 100,
        'debt': 40,
        'netWorth': lambda: person['assets']-person['debt'],
        'favouriteFruits': ['apples','bananas','orange'],
    }
    
    person['shirt'] = 'blue'
    person['assets'] = 2000
    print(f"Hi, My name is {person['name']} , I'm wearing a {person['shirt']} and My laptop is {person['laptop']}"
          f" and my networth is {person['netWorth']()} $ \nand my favourite fruits are {person['favouriteFruits']}")
    print(list(person.keys()))
    print(list(person.values()))

introducer()
