class Rectangle:
    def __init__(self, width, length):
        self.width = width
        self.length = length
    def calculateArea(self):
        return (self.width * self.length)
    def calculatePer(self):
        return (self.width + self.length) * 2
    
def main():
    rec = Rectangle(2, 3)
    print(f'The width is: {rec.width}')
    print(f'The length is {rec.length}')
    print(f'The area is: {rec.calculateArea()}')
    print(f'The perimeter is : {rec.calculatePer()}')


if __name__ == '__main__':
    main()

    