import random, copy

#8.1.1
#a)
fruits = ['Apple', 'Orange', 'Lemon', 'Pear', 'Banana']
#b)
quantities = [0]*5
#c
for index in range(len(quantities)):
    quantities[index] = random.randint(1,99)
#d
joinedList = fruits + quantities
#e
print(joinedList)

#8.1.2
#a)
for i in range(len(fruits)):
    print(f'{fruits[i] :12}{quantities[i] :7d}')

#b) deep copy
qtyCopy = copy.deepcopy(quantities)

#c
quantities[-1] = 100
print(quantities)

#d
prices = [1.99, 1.49, 3.99, 2.99, 0.99]

#e
twoDimList = [[0]*3,[0]*3,[0]*3,[0]*3,[0]*3]

#f
for i in range(len(fruits)):
    twoDimList[i][0] = fruits[i]
    twoDimList[i][1] = quantities[i]
    twoDimList[i][2] = prices[i]

#g
for i in range(len(twoDimList)):
    for j in range(len(twoDimList[i])):
        print(f'{twoDimList[i][j] :12}', end='')
    print()