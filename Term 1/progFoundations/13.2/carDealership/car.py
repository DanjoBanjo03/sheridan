class Car:

    def __init__(self, make, model):
        self.__make = make
        self.__model = model
        self.__price = 0

    def get_make(self):
        return self.__make
    
    def get_model(self):
        return self.__model
    
    def get_price(self):
        return self.__price
    
    def set_price(self, price):
        self.__price = price

    def __str__(self):
        return f'{self.__make}{self.__model} price: ${self.__price}'