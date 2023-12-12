'''
count = 1

print(f'{"Miles":15}{"Kilometers"}')
while(count <= 10):
    km = count*1.609
    print(f'{count:3}{km:19}')
    count +=1
'''
'''
invest = float(input("Enter the investement amount: "))
rate = float(input("Enter the interest rate: "))
year = 1

for year in range(1, 6): #or you can use: for year in [1, 2, 3, 4, 5]
    invest *= 1 + rate/100
    print(f'After year {year:<4d}{invest:,.2f}')
    year +=1
'''
'''
even = 0 
for even in range(2,14,2):
    print(f'{even:<10}{even*even:4}')
for even in range(12, 0, -2):
    print(f'{even:<10}{even*even:4}')
'''
'''
import turtle
NUM_CIRCLES = 36 # Number of circles to draw
RADIUS = 100 # Radius of each circle
ANGLE = 10 # Angle to turn
ANIMATION_SPEED = 0 # Animation speed
# Set the animation speed.
turtle.speed(ANIMATION_SPEED)
# Draw 36 circles, with the turtle tilted
# by 10 degrees after each circle is drawn.
for x in range(NUM_CIRCLES):
 turtle.circle(RADIUS)
 turtle.left(ANGLE)
turtle.done()
'''
'''
import turtle
numLines = 5
angle = 144
animationSpeed = 0
turtle.speed(animationSpeed)

for x in range(numLines):
    turtle.forward(100)
    turtle.right(angle)

turtle.done()
'''
'''
import random

for x in range(6):
    print(random.randint(1,49))
'''
'''
for x in range(10,35, 5):
    print(f'{x} minutes = {4.2*x:>5} calories burnt')
'''

days = int(input("Please enter how many days: "))
money = 0.01

for x in range(1, days+1):
    print(f'On day {x} you have {money:>5,.2f}')
    money *= 2