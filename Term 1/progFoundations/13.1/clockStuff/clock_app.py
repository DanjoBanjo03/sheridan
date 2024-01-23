import clock

def main():
    time = clock.Clock()
    print(time)
    try:
        hrs = int(input('Enter the hours: '))
        min = int(input('Enter the minutes: '))
        sec = int(input('Enter the seconds: '))

        # Set the values entered by the user
        # to the time object
        time.set_hours(hrs)
        time.set_minutes(min)
        time.set_seconds(sec)

        # Print the time again:
        print(time)

        total_sec = time.get_total_seconds()

        # Print the total amount of seconds in time
        print(f'Time {time} has {total_sec} seconds')
    except Exception as err:
        print(err)

if __name__ == '__main__':
    main()