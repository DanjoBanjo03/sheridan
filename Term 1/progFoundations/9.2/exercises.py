#9.2.1
import random
'''
def main():
    die1 = rollDice()
    die2 = rollDice()
    printResult(die1, die2)

def rollDice():
    return random.randint(1,6)

def printResult(num1, num2):
    print(f'{num1} and {num2} - a total of {num1 + num2}')

main()

print('-----------------------------------')
#9.2.2

def main():
    billAmount = inputs('Enter bill amount: $ ')
    tipPercent = inputs('Enter tip percentage: % ')
    tipAmount = tip(billAmount, tipPercent)
    displayAmt(tipAmount)

def inputs(prompt):
    value = input(prompt)
    while value.isalpha() or float(value) <= 0:
        print('Error! Invalid input.')
        value = input(prompt)
    return float(value)

def tip(bill, percent):
    return percent/100 * bill

def displayAmt(amount):
    print(f'{'Tip amount: $'}{amount :5}')

main()

print('-----------------------------------')

#9.2.3

def main():
    myString = input('Enter a string to be checked for palindrome: ')
    check = isPalindrome(myString)
    result(myString, check)

def isPalindrome(word):
    for i in range(int(len(word) / 2)):
        if word[i] != word[len(word) - 1 - i]:
            return False
    return True
def result(string, pal):
    if pal:
        print(f'{string} is a palindrome')
    else:
        print(f'{string} is not a palindrome')

main()
'''
#9.2.4

def main():
    data = [12, 24, 36, 48, 60, 72, 84]
    total, average, minimum, maximum = stats(data)
    printResults(total, average, minimum, maximum)

def stats(numbers):
    if len(numbers) == 0:
        return None, None, None, None
    else:
        total = sum(numbers)
        average = total / len(numbers)
        minimum = min(numbers)
        maximum = max(numbers)
        return total, average, minimum, maximum
    
def printResults(tot, avg, min, max):
    if tot is None:
        print('The list is empty')
    else:
        print(f'{"Total:" :10}{tot}')
        print(f'{"Average:" :10}{avg}')
        print(f'{"Minimum:" :10}{min}')
        print(f'{"Maximum:" :10}{max}')

main()