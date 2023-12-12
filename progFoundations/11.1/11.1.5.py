def main():
    filename = 'products.csv'
    writeToFile(filename)
    print(f'Products have been written to {filename}')
    
    
def writeToFile(filename):
    with open(filename, 'w') as prodFile:
        while True:
            name = input('Enter a product name or exit to finish: ')
            if name.lower() == 'exit':
                break
            else:
                quanitity = input('Quanitity: ')
                price = input('Price: ')
                prodFile.write(f'{name},')
                prodFile.write(f'{quanitity},')
                prodFile.write(f'{price}\n')
                print()

if __name__ == '__main__':
    main()