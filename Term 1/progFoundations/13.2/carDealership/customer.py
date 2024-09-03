class Customer:

    def __init__(self, name, address = 'Unknown address'):
        self.__name = name
        self.__address = address
        self.__owned = []

    def get_name(self):
        return self.__name

    def get_address(self):
        return self.__address

    def get_cars_owned(self):
        return self.__owned

    def set_address(self, address):
        self.__address = address

    def add_car(self, car):
        self.__owned.append(car)

    def remove_car(self, car):
        self.__owned.remove(car)

    def __str__(self):
        str_cars = '\n'
        for car in self.__owned:
            str_cars += str(car)
        return f'{self.__name}\nAddress: {self.__address}\
\nOwns the following cars: {str_cars} '

