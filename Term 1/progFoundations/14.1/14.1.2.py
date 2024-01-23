def main():
    num = int(input('Enter a number: '))
    if is_prime(num):
        print(f'{num} is a prime number')
    else:
        print(f'{num} is not a prime number')
    
    num_list = store_primes(num)
    write_to_file(num_list)

    print(f'Prime numbers smaller than {num}')
    read_file()

def is_prime(number):
    for n in range(2, number // 2 + 1):
        if number % n == 0:
            return False
    return True

def store_primes(number):
    prime_list = list()
    for num in range(1, number):
        if is_prime(num):
            prime_list.append(num)
    return prime_list

def write_to_file(num_list):
    with open('prime.txt', 'w') as prime_file:
        for num in num_list:
            prime_file.write(str(num) + '\n')

def read_file():
    with open('prime.text', 'r') as prime_file:
        for row in prime_file:
            print(row.rstrip(), end=' ')

if __name__ == '__main__':
    main()