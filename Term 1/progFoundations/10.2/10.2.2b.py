def main():
    myTuple = (2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79)
    item = int(input('Enter a value to search: '))
    ind = binarySearch(myTuple, item)
    output(item, ind)

def binarySearch(aTuple, value):
    low = 0
    high = len(aTuple) - 1
    while high >= low:
        mid = (low + high) // 2
        if value < aTuple[mid]:
            high = mid - 1
        elif value == aTuple[mid]:
            return mid
        else:
            low = mid + 1
    return -1
        
def output(value, index):
    if index != -1:
        print(f'The value {value} was found at index {index}')
    else:
        print(f'The value {value} was not found')


if __name__ == '__main__':
    main()
    