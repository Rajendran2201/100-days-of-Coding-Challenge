def count(phrase) : return len(phrase.split())
def count_words(word:str) -> int:
    word_list = word.split()
    return len(word_list)


word = "hello my dear friends!"
numberOfWords = count_words(word)
print(word)
print(count(word))
print("The length of the word is ",numberOfWords)