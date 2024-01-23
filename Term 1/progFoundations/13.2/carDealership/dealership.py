from car import Car
from customer import Customer

class Dealership:

    def __init__(self):
        self.__customers = list()
        self.__cars = list()

    def get_customers(self):
        return self.__customers
    
    def get_cars(self):
        return self.__cars
    
    def add_cars(self, cars):
        self.__cars += cars

    def add_customers(self, customers):
        self.__customers += customers

    def __str__ (self):
        str_cars = ''
        for car in self.__cars:
            str_cars += str(car)

        str_customers = ''
        for customer in self.__customers:
            str_customers += str(customer)

        return str_cars + '\n' + str_customers
        
def main():
    
    cars = list()
    cars.append(Car('Toyota', 'Corolla'))
    cars[0].set_price(25_4231.12)
    cars.append(Car('Ford', 'Focus'))
    cars[1].set_price(28_423.31)
    cars.append(Car('Mitsubishi', 'RVR'))
    cars[2].set_price(31_321.67)

    customers = []
    customers.append(Customer('Joe Python'))
    customers[0].set_address('123 Python Programming Oakville ON')
    customers[0].add_car(cars[0])
    customers[0].add_car(cars[1])

    customers.append(Customer('Jane Doe'))
    customers[0].set_address('555 Sheridan St. Oakville ON')
    customers[1].add_car(cars[2])

    dealer = Dealership()
    dealer.add_cars(cars)
    dealer.add_customers(customers)
    print(dealer)


if __name__ == '__main__':
    main()