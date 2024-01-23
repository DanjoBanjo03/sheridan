def main():
    filename = 'randomNumbers.txt'
    numberList = readFile(filename)

    average = sum(numberList) / len(numberList)
    numberList.sort()

    print(f'{numberList} and the average is {average}')

    print()

def readFile(inFile):
    numList = []
    with open(inFile, 'r') as File:
        for line in File:
            line = int(line.rstrip())
            numList.append(line)
    return numList
    
if __name__ == '__main__':
    main()
