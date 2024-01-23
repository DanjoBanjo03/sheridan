def main():
    listValues = getInput()
    myDict = makeDictionary(listValues)
    printDictionary(myDict)

def getInput():
    return input('Enter first name, last name and'
                 + ' email seperate by a comma: ').split(',')

def makeDictionary(aList):
    personDictionary = {'firstName' : aList[0],
                        'lastName:' : aList[1],
                        'email:' : aList[2]}
    return personDictionary

def printDictionary(aDict):
    for key in aDict:
        print(key, aDict[key])

main()