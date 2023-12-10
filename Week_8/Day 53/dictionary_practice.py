def word_frequency(phrase):
    result = {}
    words = phrase.split()
    for word in words :
        if word not in result :
            result[word] = 1
        else :
            result[word] +=1
    print(result)


word_frequency("I love myself and also may be  I love batman batman  ")