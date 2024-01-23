def main(): 
    try: 
        hours = int(input('How many hours did you work? ')) 
        pay_rate= float(input('Enter your hourly pay rate: ')) 
        gross_pay= hours * pay_rate 
        print(f'Grosspay: ${gross_pay:,.2f}') 
    except ValueError: print('ERROR: Hours worked, and hourly pay rate' + ' must be valid numbers.') 
        
        # Call the main function. 
if __name__ == '__main__': main()