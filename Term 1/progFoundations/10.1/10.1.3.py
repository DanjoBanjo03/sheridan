import random

def main():
    fullList = generateList()
    even = evenNumbersList(fullList)
    print(fullList)
    print(even)

def generateList():
    listOfTen = []
    for i in range(10):
        listOfTen.append(random.randint(1, 99))
    return listOfTen

def evenNumbersList(aList):
    evenList = []
    for item in aList:
        if item % 2 == 0:
            evenList.append(item)
    return evenList
def printList(aList):
    for number in aList:
        print(number, end = '\t')
    print()

main()