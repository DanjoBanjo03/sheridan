import turtle

wn = turtle.Screen()
wn.title('Blue and Red Turtle')
wn.bgcolor('light yellow')
turtle.hideturtle()

myT1 = turtle.Turtle()
myT1.color('green')
myT1.shape('turtle') # make turtle shaped as turtle
myT1.penup() # raise the pen up before moving
myT1.goto(100, 100)
myT1.pendown() # low the pen to get ready for drawing
myT1.right(90)
myT1.forward(100)
myT1.left(90)
myT1.forward(50)

myT2 = turtle.Turtle()
myT2.color('blue')
myT2.shape('turtle') # make turtle shaped as turtle
myT2.penup() # raise the pen up before moving
myT2.goto(-100, -100)
myT2.pendown() # low the pen to get ready for drawing
myT2.right(90)
myT2.forward(100)
myT2.left(90)
myT2.forward(50)

turtle.done()