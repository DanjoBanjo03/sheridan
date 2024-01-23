class Fraction:
    def get_value(self):
        return self.numerator / self.denominator
    def inverse(self):
        self.numerator, self.denominator = self.denominator, self.numerator
frac = Fraction()
frac.numerator = 2
frac.denominator = 3

print(f'The fraction is: {frac.numerator} / {frac.denominator}')
print(f'Fraction\'s value: {frac.get_value()}')

frac.inverse()

print(f'Fraction after inversion: {frac.numerator} / {frac.denominator}')
print(f'Fraction\'s value after inversion: {frac.get_value()}') 