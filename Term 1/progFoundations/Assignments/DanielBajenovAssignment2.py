# Assignment 2
# Author: Daniel Bajenov
# Date: Oct 29, 2023
    
# Description: A code that find the tax return or pay for citizens of
# Simpleton. Following rules of tax percentages per income. 

#set the decimal value of the tax percent
less20 = 0
less50 = 0.10
less100 = 0.18
more100 = 0.25

#starts an infinite loop for asking income
while True:
    #ask user for their income
    income = float(input("Please enter income amount: "))
    #continue if the income is greater or equal to 0
    if (income >= 0):
        #start infinite loop for asking the tax paid
        while True:
            #Ask user for the amount of tax already paid
            taxPaid = float(input("Tax amount already payed: "))
            # continue if it is greater or equal to 0, income is not equal to the tax paid, 
            # and tax paid is less than income
            if taxPaid >= 0 and taxPaid != income and taxPaid < income:
                # if it is less than 20,000 then
                if (income < 20000):
                    # type the Base tax, how much tax is due, and then align it
                    print(f'{"Base Tax: ":23}{"$"}{less20:8,}')
                    # type the already paid tax and then align it
                    print(f'{"Tax already paid: ":23}{"$"}{taxPaid:8,}')
                    # type the Tax refund, how much refund is due, and then align it
                    print(f'{"Tax refund: ":23}{"$"}{taxPaid:8,}')
                    #breaks the tax paid loop
                    break
                # or if income is greater or equal to 20,000 and less than 50,000
                elif (income >= 20000 and income < 50000):
                    #do the calculations for the base tax
                    answer = less50 * income
                    # type the Base tax, how much tax is due, and then align it
                    print(f'{"Base Tax: ":23}{"$"}{answer:8,}')
                    # type the tax already paid and then align it
                    print(f'{"Tax already paid: ":23}{"$"}{taxPaid:8,}')
                    #check if it is a refund or a pay tax
                    if (answer > taxPaid):
                        #print how much is required to pay
                        print(f'{"Tax payable: ":23}{"$"}{answer - taxPaid:8,}')
                    elif (answer < taxPaid):
                        #print how much refund is due
                        print(f'{"Refund due: ":23}{"$"}{taxPaid - answer:8,}')
                    #breaks the tax paid loop
                    break
                # or if income is greater or equal to 50,000 and less than 100,000
                elif (income >= 50000 and income < 100000):
                    #do the calculations for the base tax
                    answer = less100 * income
                    # type the Base tax, how much tax is due, and then align it
                    print(f'{"Base Tax: ":23}{"$"}{answer:8,}')
                    # type the tax already paid and then align it
                    print(f'{"Tax already paid: ":23}{"$"}{taxPaid:8,}')
                    #check if it is a refund or a pay tax
                    if (answer > taxPaid):
                        #print how much is required to pay
                        print(f'{"Tax payable: ":23}{"$"}{answer - taxPaid:8,}')
                        #print how much refund is due
                    elif (answer < taxPaid):
                        print(f'{"Refund due: ":23}{"$"}{taxPaid - answer:8,}')
                    #breaks the tax paid loop
                    break
                # or if income is greater or equal to 100,000
                elif (income >= 100000):
                    #do the calculations for the base tax
                    answer = more100 * income
                    # type the Base tax, how much tax is due, and then align it
                    print(f'{"Base Tax: ":23}{"$"}{answer:8,}')
                    # type the tax already paid and then align it
                    print(f'{"Tax already paid: ":23}{"$"}{taxPaid:8,}')
                    #check if it is a refund or a pay tax
                    if (answer > taxPaid):
                        #print how much is required to pay
                        print(f'{"Tax payable: ":23}{"$"}{answer - taxPaid:8,}')
                    elif (answer < taxPaid):
                        #print how much refund is due
                        print(f'{"Refund due: ":23}{"$"}{taxPaid - answer:8,}')
                    #breaks the tax paid loop
                    break
            #if tax already paid is less than 0, throw an error, and loop the question
            elif taxPaid < 0:
                print("The tax already payed cannot be less than 0!")
            #if tax already paid is equal to or greater than income, throw an error,
            #and loop the question
            elif taxPaid == income or taxPaid > income:
                print("The tax paid cannot be equal or greater than the income!")
        #stop the income loop
        break
    #if they typed an income less than 0 throw an error
    else:
        print('Income cannot be less than zero!')