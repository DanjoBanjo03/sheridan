class Clock:
    def __init__(self, hours=0, minutes=0, seconds=0):
        self.set_hours(hours)
        self.set_minutes(minutes)
        self.set_seconds(seconds)

    def get_hours(self):
        return self.__hours

    def get_minutes(self):
        return self.__minutes
    
    def get_seconds(self):
        return self.__seconds

    def set_hours(self, hours):
        if 0 <= hours < 24:
            self.__hours = hours
        else:
            raise ValueError('Invalid Hours!')

    def set_minutes(self, minutes):
        if 0 <= minutes < 60:
            self.__minutes = minutes
        else:
            raise ValueError('Invalid Minutes!')

    def set_seconds(self, seconds):
        if 0 <= seconds < 60:
            self.__seconds = seconds
        else:
            raise ValueError('Invalid Seconds!')

    def __str__(self):
        return f'{self.__hours :02d}:{self.__minutes :02d}:{self.__seconds :02d}'