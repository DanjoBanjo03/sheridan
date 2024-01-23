def main():
    myTuple = (1, 4, 4, 2, 5, -3, 6, 2)
    item = int(input('Enter a value to search: '))
    ind = linearSearch(myTuple, item)
    output(item, ind)

def linearSearch(aTuple, value):
    for index in range(len(aTuple)):
        if aTuple[index] == value:
            return index
    return - 1
        
def output(value, index):
    if index != -1:
        print(f'The value {value} was found at index {index}')
    else:
        print(f'The value {value} was not found')


if __name__ == '__main__':
    main()
    