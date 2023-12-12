def main():
    filename = 'output.txt'
    contentList = readFile(filename)
    printContent(contentList)

def readFile(inFile):
    textList = []
    with open(inFile, 'r') as inFile:
        for line in inFile:
            line = line.rstrip('\n')
            textList.append(line)
    return textList

def printContent(inList):
    for item in inList:
        print(item)

if __name__ == '__main__':
    main()
