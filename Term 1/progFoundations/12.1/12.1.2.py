import math

class Circle:
    def __init__(self, radius):
        self.radius = radius

    def get_area(self):
        return math.pi * self.radius ** 2

    def get_circumference(self):
        return 2 * math.pi * self.radius
    
    def __str__(self):
        return f'Type: Circle, Radius: {self.radius}'


def main():
    cir = Circle(5.7)
    area = cir.get_area()
    circumference = cir.get_circumference()

    print(cir)
    print(f'The area is {area}')
    print(f'The circumference is {circumference}')

if __name__ == '__main__':
    main()