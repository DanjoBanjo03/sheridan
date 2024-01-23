import random

def main():
    myList = generateList()
    print(myList)
    bubbleSort(myList)
    print(myList)

def generateList():
    randomList = []
    for i in range(10):
        randomList.append(random.randint(1,99))
    return randomList

def bubbleSort(aList):
    for i in range(len(aList)):
        for j in range(len(aList) - 1 - i):
            if aList[j] > aList[j+1]:
                aList[j], aList[j+1], = aList[j+1], aList[j]

if __name__ == '__main__':
    main()