def main():
    getName()
    display(f'Goodbye!')

def getName():
    name = input("Please enter your name: ")
    print(f'Hello {name}')


def display(message):
    print(message)

main()