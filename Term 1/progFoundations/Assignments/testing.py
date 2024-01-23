def get_account_balances():
    return [float(balance) for balance in input("Enter account balances separated by spaces: ").split()]

def calculate_interest(balances):
    return [balance * 0.02 / 12 for balance in balances]

def print_interest_details(individual_balances, interest_amounts):
    print("\nInterest Details:")
    for i in range(len(individual_balances)):
        print(f"Account {i + 1}: Balance - ${individual_balances[i]:.2f} | Interest - ${interest_amounts[i]:.2f}")

def main():
    account_balances = get_account_balances()
    interest_amounts = calculate_interest(account_balances)
    print_interest_details(account_balances, interest_amounts)

if __name__ == "__main__":
    main()