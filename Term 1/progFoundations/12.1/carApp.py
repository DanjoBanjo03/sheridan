import car

def main():
    car1 = car.Car('Toyota', 'Corolla', 'Red', 25000)
    car2 = car.Car('Ford', 'Focus', 'Grey', 39458)
    print(car1)
    print(car2)
    print()

    paint(car1, "Black")
    paint(car2, "White")
    checkup(car1, 5000)
    checkup(car2, 1111)
    print(car1)
    print(car2)

def paint(car, new_colour):
    car.change_colour(new_colour)

def checkup(car, add_km):
    car.update_km(add_km)

if __name__ == '__main__':
    main()