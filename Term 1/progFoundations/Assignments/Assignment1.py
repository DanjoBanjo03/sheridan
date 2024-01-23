import math #Import the math module so that we can use sqrt

#Some spacing to push away all the terminal info
print("")
print("")

#Ask the user for an input on planet name.
planet = input("Please Enter A Planet Name: ")

#Ask user for planet circumference
planetCir = float(input('Please enter circumference of your planet (in KM): '))

#Ask user for planet Gravity Acceleration
planetGrav = float(input("Please enter the planet's Gravity acceleration (m/s^2): "))

#Print the universal graviational constant with 1 float point and in exponenet form
uniGrav = 6.67226e-11

#Do some math to find the radius of the planet. r = C/2pi
planetRad = planetCir / (math.pi*2)

#Do some math to find the mass of the planet using exponential form
planetMass = ((planetRad**2)*planetGrav)/uniGrav

#Do some math to find the escape velocity using the given formula
planetEsc = math.sqrt(2*uniGrav*planetMass/planetRad)

#Prints the gravitational constant, radius, mass and escape velocity of the planet
print(f'The universal gravitational constant is: {uniGrav:9.1e}')
print(f'{"The radius of "+ planet +" is (KM): ":42}{planetRad:8,.1f}')
print(f'{"The mass of "+ planet +" is: ":42}{planetMass:8.1e}')
print(f'{"The escape velocity for " + planet + " is: ":42}{planetEsc:8.1f}')