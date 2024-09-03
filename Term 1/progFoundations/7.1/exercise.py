#7.1.2
'''
number = -1
count = 0
total = 0
while number != 0:
    number = input('Enter a number or 0 if you want to quit: ')
    total = total + number
    count += 1

average = total / count
print(f'You entered {count} numbers and the average is {average}')'''

#7.1.3
'''
keepGoing= 'yes'
count = 0
total = 0
while keepGoing.lower() == 'yes':
    number = float(input('Enter a number or 0 if you want to quit: '))
    total = total + number
    count += 1
    keepGoing  = input('Do you want to continue? (yes/no) ')

average = total / count
print(f'You entered {count} numbers and the average is {average}')
'''

#7.1.4

count = 0
total = 0

while True:
    strNumber = input('Enter a number ')
    if strNumber.isdigit():
        total += float(strNumber)
        count += 1
    else:
        break

average = total / count
print(f'You entered {count} numbers and the average is {average}')