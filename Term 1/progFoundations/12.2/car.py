class Car:
    def __init__(self, make, model, colour, km=0):
        self.__make = make
        self.__model = model
        self.__colour = colour
        self.__km = km

    def get_make(self):
        return self.__make
    
    def get_model(self):
        return self.__model
    
    def get_colour(self):
        return self.__colour

    def get_kilometres(self):
        return self.__km
    
    def change_colour(self, colour):
        self.__colour = colour
    
    def update_km(self, add_km):
        if add_km < 0:
            raise ValueError('INVALID ENTRY')
        else:
            self.__km += add_km
        
    def __str__(self):
        return  f'Car: {self.__make}, {self.__model}, {self.__colour}, {self.__km}'
