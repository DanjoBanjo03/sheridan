class Car:
    def __init__(self, make, model, colour, km):
        self.make = make
        self.model = model
        self.colour = colour
        self.km = km
    def change_colour(self, colour):
        self.colour = colour
    def update_km(self, additional_km):
        self.km + additional_km
    def __str__(self):
        return  f'Car: {self.make}, {self.model}, {self.colour}, {self.km}'
