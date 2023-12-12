class Fraction:
    def __init__(self,numerator,denominator):
        self.numerator = numerator
        self.denominator = denominator
    
    def get_value(self):
        return self.numerator / self.denominator
    
    def inverse(self):
        self.numerator, self.denominator = self.denominator, self.numerator
frac = Fraction(2, 3)

print(f'The fraction is: {frac.numerator} / {frac.denominator}')
print(f'Fraction\'s value: {frac.get_value()}')

frac.inverse()

print(f'Fraction after inversion: {frac.numerator} / {frac.denominator}')
print(f'Fraction\'s value after inversion: {frac.get_value()}') 