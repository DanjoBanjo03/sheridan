class Fraction:
    def get_value(self):
        return self.numerator / self.denominator
    
frac = Fraction()
frac.numerator = 2
frac. denominator = 3
value = frac.get_value()
print(f'The value is: {value}')