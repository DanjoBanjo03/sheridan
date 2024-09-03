import turtle
import random


wn = turtle.Screen()
wn.title('Draw shape')
myT = turtle.Turtle()
myT.shape('turtle')
number = random.randint(1,2)

if number == 1:
    myT.color('red')
    r = 50
    myT.circle(r)
else:
    myT.color('blue')
    s = 50
    myT.forward(s)
    myT.left(90)
    myT.forward(s)
    myT.left(90)
    myT.forward(s)
    myT.left(90)
    myT.forward(s)
    myT.left(90)

turtle.done()    