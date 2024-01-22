def main():
    filename = 'output.txt'
    writeToFile(filename)
    print(f'Data was written to {filename}')

def writeToFile(inFileName):
    with open(inFileName, 'a') as outFile:
        while True:
            userInput = input('Enter a word/sentence or exit to finish: ')
            if userInput.lower() == 'exit':
                break
            else:
                outFile.write(userInput + '\n')

if __name__ == '__main__':
    main()