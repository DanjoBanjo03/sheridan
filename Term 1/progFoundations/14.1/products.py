class Product:
    def __init__(self, name, qty, price):
        self.set_name(name)
        self.set_qty(qty)
        self.set_price(price)

    def get_name(self):
        return self.__name

    def get_quantity(self):
        self.__qty

    def get_price(self):
        self.__price

    def set_name(self, name):
        if name == '':
            raise ValueError('Name cannot be empty!')
        else:
            self.__name = name

    def set_qty(self, qty):
        if qty < 0:
            raise ValueError('Number cannot be negative!')
        else:
            self.__qty = qty

    def set_price(self, price):
        if price < 0:
            raise ValueError('Number cannot be negative!')
        else:
            self.__price = price

    def calc_total(self, num):
        if num < 0:
            raise ValueError('Number of products cannot be negative!')
        else:
            return self.__price / self.__qty * num

    def __str__(self):
        return f'{self.__name}{self.__qty} ${self.__price:,.2f}'