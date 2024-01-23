import fraction4
def main():
    my_frac = create_fraction(5, 7)
    display_frac(my_frac)
def create_fraction(num, den):
    return fraction4.Fraction(num, den) #you can put an input here.
def display_frac(obj_frac):
    print(obj_frac)
    print(obj_frac.get_value())
    print(type(obj_frac))
if __name__ == '__main__':
    main()