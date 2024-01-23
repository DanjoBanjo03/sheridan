def main():
    names = ['Alice', 'Bob', 'Eve', 'Carol']
    sortedNames = sortDescending(names)
    print(sortedNames)

def sortDescending(inputList):
    return sorted(inputList, reverse=True)

if __name__ == '__main__':
    main()