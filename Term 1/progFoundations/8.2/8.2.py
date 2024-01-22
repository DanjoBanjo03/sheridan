'''
#8.2.1
#Create a tuple that will store 5 course codes: 'PROG123583', 'SYST10049', 'TELE13167', 'COMM13729', 'MATH18584'
className = ('PROG123583', 'SYST10049', 'TELE13167', 'COMM13729', 'MATH18584')
#Create another tuple that will store the final grade for each of the above courses
grade = (100,99,98,97,96)
#Use a for loop to print the course codes and final grades side by side.
for i in range(len(grade)):
    print(f'{className[i] :15}{grade[i]:3d}')
#Display only the first, the third and fifth item from the course tuple
print('------------------')
print(f'{className[0] :15}{grade[0]:3d}')
print(f'{className[2] :15}{grade[2]:3d}')
print(f'{className[4] :15}{grade[4]:3d}')
print('------------------')
print(f'{className[::2]}{grade[::2]}')
#Calculate and display the highest, the lowest and average grade from grades tuple
print('------------------')
print(max(grade))
print(min(grade))
print(sum(grade) / len(grade))

#8.2.2
#Create a dictionary named produce that will have the following key and value pairs:
    #name - Apple
    #quantity - 4.5
    #Unit - kg
    #price - 1.99
produce = {'Name':'Apple', 'Quantity':4.5, 'Unit':'kg', 'Price':1.99}
#Add variety "Red delicious" to the dictionary and print the dictionary
print('----------------')
produce['Variety'] = 'Red Delicious'
print(produce)
#Print only the price from dictionary
print('----------------')
print(produce['Price'])
#Write the code that will check whether or not a produce with name "Orange" is in dictionary
print('----------------')
if 'Orange' not in produce:
    print('Orange is not in produce')
#Replace the unit "kg" with "lbs" and print the dictionary
print('----------------')
produce['Unit'] = 'lbs'
print(produce)
#Delete the entry for the variety and print the dictionary
print('----------------')
del produce['Variety']
print(produce)
#Use a for loop to iterate over the dictionary and print all key and value pairs
print('----------------')
for i in produce:
    print(f'{i:15}{produce[i]}')

#8.2.4
#Using the dictionary created in exercise 8.2.2, write the code to perform the following tasks:
print('----------------')
print(produce.get('Name', 'Entry does not exist'))
print(produce.get('variety', 'Entry does not exist'))
#Use a dictionary method, to print the values for names and variety, if they exist or 'Entry not found' if they don't exist
print('----------------')
items = produce.items()
print(list(items))
#Use a dictionary method create and print the key - value pairs as a list of tuples
print('----------------')

#Write the code to display only the keys of the dictionary
print('----------------')
for key in produce.keys():
    print(key)
#Write the code to display only the values of the dictionary
print('----------------')
for val in produce.values():
    print(val)
#Write the code to return the last key - value pairs and remove it from the dictionary. Print both the entry that was removed and the remaining items in the dictionary
print('----------------')
lastKey, lastValue = produce.popitem()
print(lastKey, lastValue)
#Write statements to empty the dictionary. Print it to show that it is empty
produce.clear()
print(produce)
'''

import random
#8.2.5
lotoNums = set()

while len(lotoNums) < 6:
    lotoNums.add(random.randint(1, 49))
print(lotoNums)

#8.2.6

courses = set([('PROG123583', 78),
               ('SYST10049', 68),
               ('TELE13167', 75),
               ('COMM13729', 82),
               ('MATH18584',  91)])
print(f'{"Courses" :10}{"Grades" :5}')
for item in courses:
    print(f'{item[0] :10}{item[1] :3d}')