from datetime import date

class Account:

    _annual_interests_rate = 0

    def __init__(self, account_id, balance=0):
        self.__account_id = account_id
        self.set_balance(balance)
        self.__date_created = date.today()

    def get_id(self):
        return self.__account_id

    def get_balance(self):
        return self.__balance

    def get_date_created(self):
        return self.__date_created

    def set_balance(self, balance):
        if balance < 0:
            raise ValueError('Balance cannot be negative')
        else:
            self.__balance = balance

    @classmethod
    def set_annual_intrest_rate(cls, new_interest_rate):
        cls._annual_interests_rate = new_interest_rate

    @classmethod
    def get_monthly_interest_rate(cls):
        return cls._annual_interests_rate / 1200

    def get_monthly_interest(self):
        return self.__balance * self.get_monthly_interest()

    def withdraw(self, amount):
        if amount > 0:
            self.__balance -= amount
            if self.__balance < 0:
                self.__balance += amount
                raise ValueError('Negative balance. Transaction cancelled')
        else:
            raise ValueError('Withdraw amount cannnot be negative')

    def deposit(self, amount):
        if amount < 0:
            raise ValueError('Deposit must be positive')
        else:
            self.__balance += amount

    def __str__(self):
        return f'{self.__account_id:<10}{self.__balance :12.2f}\
            {self.get_monthly_interest() :10,.2f}{str({self.__date_created :13})}'