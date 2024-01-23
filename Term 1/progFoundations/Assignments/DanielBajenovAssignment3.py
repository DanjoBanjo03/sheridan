# Assignment 3
# Author: Daniel Bajenov
# Date: Nov 20, 2023
    
# Description:Make a code to figure out the 
# interest people earn on this banks plan per month

#create the main function
def main():
    #set the variable to the function to plug into next function
    accountBalances = getBalance()
    #assign this variable to another function and pass on the previous
    #function to the calculate function so that it uses the numbers
    interestAmounts = calculate(accountBalances)
    #send the display function all the information we have to display
    display(accountBalances, interestAmounts)

# function to get the inputs
def getBalance():
    # make a variable to recieve the list of balances
    balanceAll = input('Please enter account balances ' 
                    + ' seperated by a space: ').split()
    # set the next variable to make a float list that uses the spaces
    # as the seperators
    accountBalances = [float(balance) for balance in balanceAll]
    #return the information to the variable to be used later
    return accountBalances

# function to do the math
def calculate(accountBalances):
    # create a variable for the interest rate in decimal
    RATE = 0.02
    MONTHSINYEAR = 12
    # make a loop for the ammount of accounts it will cycle
    for i in range(len(accountBalances)):
        # calculate the interest total for every account
        interestTotal = [(balance * RATE / MONTHSINYEAR) for balance in accountBalances]
        #send the information back to the variable
        return interestTotal

# create a function to display the information
def display(allBalances, interestTotal):
    # print and format the table as in example with titles
    print('_____________________________________________')
    print(f"{'Accounts':16}{'Balance':11}{'Interest'}")
    print('_____________________________________________')
    # loop for amount of accounts in variable
    for i in range(len(allBalances)):
        # print all the information
        print(f"Account {i + 1}: " +
              f"{allBalances[i]:12.2f}{interestTotal[i]:10.2f}")

#check that it runs the script not another script file
if __name__ == "__main__":
    #calls the main function
    main()