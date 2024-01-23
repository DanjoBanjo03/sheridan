'''
string1 = '1234'
string2 = 'abcd'
string3 = 'ABCD'
print(string1.isdigit())
print(string1.isalnum())
print(string2.isalpha())
print(string2.isdigit())
print(string2.isupper())
print(string2.islower())
print(string3.isupper())
'''
'''
string= input("Enter a string: ")

#Find the length
length = len(string)

#does it contain letters only
letters = string.isalpha()

#is it in uppercase
upper = string.isupper()

#is it spaces only
space = string.isspace()

#does it contain word "is"
word = 'is' in string

print(f'The string has {length} characters')
print(f'The string contains only letters: {letters}')
print(f'Is it upper case? {upper}')
print(f'Is it only spaces? {space}')
print(f'Does it contain the word "is"? {word}')
'''
'''
num1, num2 = input("Enter two numbers seperated by a space: ").split()
num1, num2 = (float(num1), float(num2))
result = num1*num2
print(f'{num1}*{num2} = {result}')
'''
'''
sentence = "Hello How are you?"
#Display senence in all caps
sentence.upper()
print(sentence)
#Display only the word second from last
list = sentence.split()
print(list[-2])
#Display without the last word
print(sentence.strip(list[-1]))
# Display fourth character
print(sentence[4])
#Display every third character
print(sentence[0:len(sentence):3])
'''
'''
sentence = input("Enter a sentence: ")
existing = input("Enter the words you want to replace: ")
newWord = input('Enter word you want to replace it with: ')

newSentence = sentence.replace(existing, newWord)

print(newSentence)
'''