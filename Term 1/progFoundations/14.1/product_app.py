from products import Product

def main():
    product1 = Product('apple', 12, 2.99)
    product2 = Product('squash', 2, 3.99)
    product3 = Product('corn', 6, 1.99)

    total = 0.0
    keep_going = 'y'
    try:
        while keep_going.lower() == 'y':
            name = input('Enter product name: ')
            num = int(input('Enter the number of products: '))
            if product1.get_name() == name:
                amount = product1.calc_total(num)
            elif product2.get_name() == name:
                amount = product2.calc_total(num)
            elif product3.get_name() == name:
                amount = product3.calc_total(num)
            else:
                print(f'Sorry, there are no {name} in stock')
                amount = 0
            print(f'{name}: ${amount :.2f}')
            total += amount
            keep_going = input('Anything else? (y/n): ')

        print(f'Total amount: ${total :,.2f}')
    except Exception as err:
        print(err)

if __name__ == '__main__':
    main()