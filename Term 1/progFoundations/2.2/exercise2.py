'''secInHour = 3600
secInMin = 60

time = 7368

hours = time // secInHour
min = time % secInHour //secInMin
sec = time % secInHour % secInMin

print("Hours:", hours)
print("Minutes:", min)
print("Seconds:", sec)'''

toonieg = 2
loonieg = 1
quarterg = 0.25
dimeg = 0.1
nickelg = 0.05
pennieg = 0.01

given = float(input("Please enter an amount: "))

toonie = given // toonieg
loonie = given % toonieg // loonieg
quarter = given % toonieg % loonieg // quarterg
dime = given % toonieg % loonieg % quarterg // dimeg
nickel = given % toonieg % loonieg % quarterg % dimeg //nickelg
pennie = given % toonieg % loonieg % quarterg % dimeg %nickelg // pennieg

print("Toonies: ", int(toonie), sep = '')
print("Loonies: ", int(loonie), sep = '')
print("Quarters: ", int(quarter), sep = '')
print("Dimes: ", int(dime), sep = '')
print("Nickels: ", int(nickel), sep = '')
print("Pennies: ", int(pennie), sep = '')
print("Total: $", given, sep = '')