from account import Account

def main():
    Account.set_annual_intrest_rate(2)
    acc = create_account()
    menu(acc)

def create_account():
    try:
        id = int(input('Enter account ID: '))
        bal = float(input('Enter the balance: '))
        acc = Account(id, bal)
    except Exception as err:
        print(err)
        acc = create_account()
    return acc

def menu(acc):
    while True:
        try:
            print('Select the type of transaction: ')
            print('1. Deposit')
            print('2. Withdraw')
            print('3. Print Account Information')
            print('4. Exit')

            choice = int(input('Enter the selection number: '))
            if choice == 1:
                make_transaction(acc, 1)
            elif choice == 2:
                make_transaction(acc, 2)
            elif choice == 3:
                make_transaction(acc, 3)
            elif choice == 4:
                exit()
            else:
                print('Invalid Choice!')
        except Exception as err:
            print(err)

def make_transaction(acc, transaction):
    if transaction == 1:
        amt = float(input('Enter the deposit amount: '))
        acc.deposit(amt)
    elif transaction == 2:
        amt = float(input('Enter withdraw amount: '))
        acc.withdraw(amt)
    else:
        print_account(acc)

def print_account(acc):
    print('-' * 45)
    print(f'{'Account ID' :14}{'Balance' :10}{'Month.Intr' :14}{'Date' :10}')
    print(acc)
    print('-' * 45)
    
if __name__ == '__main__':
    main()
