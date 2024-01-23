import fraction4

def main():
# Create three objects from the fraction class.
    frac1 = fraction4.Fraction(3, 5)
    frac2 = fraction4.Fraction(2, 7)
# Display fractions
    print(f'First fraction: {frac1}')
    print(f'Second fraction: {frac2}')
    print()
# Multiply the first fraction by 2 and divide the second
# fraction by 3 and display the modified fractions
    frac1.multiply(2)
    frac2.divide(3)
    print(f'First fraction after multiplication: {frac1}')
    print(f'Second fraction after division: {frac2}')
# Call the main function
if __name__ == '__main__':
    main()