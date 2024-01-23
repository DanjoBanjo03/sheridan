'''salary = float(input("Please enter your salary: "))

if (salary >= 30000):
    years = float(input("How many years have you been on the job?: "))
    if (years >= 3):
        print("You qualify for the loan!")
    else:
        print("You must be at your current job for a minimum of 2 years to qualify.")
else:
    print("You must earn $30, 000 per year to qualify.")
'''
'''
saleAmount = float(input("Please input the sales amount: "))
if (saleAmount < 0):
    print("Invalid Sales Amount!")
    quit()
elif (saleAmount < 1000):
    total1= saleAmount*1.05
    print(f'{total1:.2f}')
elif (saleAmount >= 1000 and saleAmount < 2000):
    total2= saleAmount*1.075
    print(f'{total2:.2f}')
elif (saleAmount >= 2000 and saleAmount < 3500):
    total3 = saleAmount*1.1
    print(f'{total3:.2f}')
elif (saleAmount >= 3500):
    total4= saleAmount*1.15
    print(f'{total4:.2f}')
'''

day_num = int(input('Enter the day number: '))

if (day_num == 1):
    day = "Monday"
elif (day_num == 2):
    day = "Tuesday"
elif (day_num == 3):
    day = "Wednesday"
elif (day_num == 4):
    day = "Thursday"
elif (day_num == 5):
    day = "Friday"
elif (day_num == 6):
    day = "Saturday"
elif (day_num == 7):
    day = "Sunday"
else:
    day = 'invalid day number'

print(f'{day_num} is {day}')