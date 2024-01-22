import random

def main():
    filename = 'randomNumbers.txt'
    writeNumbers(filename)
    print(f'\n Numbers were written to {filename}')


def writeNumbers(fileName):
     with open(fileName, 'a') as outFile:
        for i in range(10):
            outFile.write(str(random.randint(1, 100)) + '\n')

if __name__ == '__main__':
    main()