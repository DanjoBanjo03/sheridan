import clock
SEC_IN_HOUR = 3600
SEC_IN_MIN = 60


def main():
    time = clock.Clock()
    print(time)
    try:
        hrs = get_input(time, 'Please enter the hours: ')
        min = get_input(time,'Please enter the minutes: ')
        sec = get_input(time, 'Please enter the seconds: ')
        print(time)

        total_sec = SEC_IN_HOUR * time.get_hours() +\
            SEC_IN_MIN * time.get_minutes() + time.get_seconds
        
        print(f'The total seconds is: {total_sec}')
    except ValueError as err:
        print(err)

def get_input(time, prompt):
    while True:
        try:
            value = int(prompt)
            if prompt.split()[-1] == 'hours:' :
                time.set_hours(value)
                break
            elif prompt.split()[-1] == 'minutes:':
                time.set_minutes(value)
                break
            else:
                time.set_seconds(value)
                break
        except Exception as err:
            print(err)
            
        
if __name__ == '__main__':
    main()