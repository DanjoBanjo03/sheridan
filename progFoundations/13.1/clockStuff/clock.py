class Clock:

    SEC_IN_HOUR = 3600
    SEC_IN_MIN = 60

    #  Initializer takes all attributes as parameters
    # Default attributes are set to 0, which makes them optional
    def __init__(self, hours=0, minutes=0, seconds=0):
        self.set_hours(hours)
        self.set_minutes(minutes)
        self.set_seconds(seconds)

    # Accessor for getting the value of hours
    def get_hours(self):
        return self.__hours

    # Accessor for getting the value of minutes
    def get_minutes(self):
        return self.__minutes

    # Accessor for getting the value of seconds
    def get_seconds(self):
        return self.__seconds
    
    def get_total_seconds(self):
        return self.get_hours() * self.SEC_IN_HOUR\
            + self.get_minutes() * self.SEC_IN_MIN\
            + self.get_seconds()
        

    # Mutator for setting the value of hours
    # Rejects values that are less than 0 or greater than 23
    def set_hours(self, hours):
        if 0 <= hours < 24:
            self.__hours = hours
        else:
            raise ValueError('Hours must be between 0 and 23')

    # Mutator for setting the value of minutes
    # Rejects values that are less than 0 or greater than 60
    def set_minutes(self, minutes):
        if 0 <= minutes < 60:
            self.__minutes = minutes
        else:
            raise ValueError('Minutes must be between 0 and 59')

    # Mutator for setting the value of seconds
    # Rejects values that are less than 0 or greater than 60
    def set_seconds(self, seconds):
        if 0 <= seconds < 60:
            self.__seconds = seconds
        else:
            raise ValueError('Seconds must be between 0 and 59')

    # Returns the clock object in a string format: hh:mm:ss
    def __str__(self):
        return f'{self.__hours :02d}\
:{self.__minutes :02d}:{self.__seconds :02d}'