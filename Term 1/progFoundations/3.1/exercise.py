'''
First= input("Please Enter Your First Name: ")
Last = input("Please Enter Your Last Name: ")
print("Hello", First, Last)
'''
'''
num = int(input("Please enter a number: "))
half = num/2
print(half)
'''
'''
excercise 3.2.1
destination = input("Enter travelling destination: ")
distance = int(input('Enter the travelling distance (in KM): '))
time = int(input("Enter travelling time (in hours): "))
avg_speed = distance/time
print('Travelling to', destination)
print('Average speed', avg_speed, 'km/hrs')
'''
'''
print('One\nTwo\nThree')
print('One\tTwo\tThree')
print('He said: \'I\'m coming tomorrow\'')
print("The path is: \"C:\\temp\\files\"")
'''
'''
excercise 3.2.2
destination = input("Enter travelling destination: ")
distance = int(input('Enter the travelling distance (in KM): '))
time = int(input("Enter travelling time (in hours): "))
avg_speed = float(distance/time)
print('Travelling to', destination, '\nAverage speed', avg_speed, 'km/hrs')
print()
'''

'''
excercise 3.2.3
avg_price = 59.7834
print("Price:", format(avg_price, '.2f'))
big_number = 45963726.742168
print("Number:", format(big_number, '.1e'))
small_number = 0.00000078234
print("Small:", format(small_number, '.3e'))
value_change = 0.002146
print("Value:", format(value_change, '.1%'))
'''
'''
exercise 3.2.4
avg_price = 59.7834
print("Price:",'{:.2f}'.format(avg_price))
big_number = 45963726.742168
print("Number:", '{:.1e}'.format(big_number,))
small_number = 0.00000078234
print("Small:", '{:.3e}'.format(small_number))
value_change = 0.002146
print("Value:", '{:.1%}'.format(value_change))
'''