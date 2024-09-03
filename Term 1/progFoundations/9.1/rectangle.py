def main():
    width = int(input('Enter width of the rectangle: '))
    height = int(input('Enter heigh of the rectangle: '))
    printRectangle(width, height)

def printRow(w):
    for i in range(w):
        print(f'{"*" :3}', end='')

def printRectangle(w, h):
    for i in range(h):
        printRow(w)
        print()

main()