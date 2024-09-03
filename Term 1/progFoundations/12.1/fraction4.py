class Fraction:
    def __init__(self,numerator,denominator):
        self.numerator = numerator
        self.denominator = denominator
    
    def get_value(self):
        return self.numerator / self.denominator
    
    def inverse(self):
        self.numerator, self.denominator = self.denominator, self.numerator

    def multiply(self, number):
        self.numerator *= number
    
    def divide(self, number):
        self.denominator *= number

    def __str__(self):
        return f'{self.numerator}/{self.denominator}'

def main():
    frac = Fraction(2, 3)

    print(f'The fraction is: {frac}')
    print(f'Fraction\'s value: {frac.get_value()}')

    frac.inverse()

    print(f'Fraction after inversion: {frac}')
    print(f'Fraction\'s value after inversion: {frac.get_value()}') 

    frac.multiply(5)
    print(f'The fraction after multiplication is: {frac}')
    print(f'Fraction\'s value after multiplication: {frac.get_value()}') 
    frac.divide(7)
    print(f'The fraction after division is: {frac}')
    print(f'Fraction\'s value after division: {frac.get_value()}') 

if __name__ == '__main__':
    main()