# Assignment 4
# Author: Daniel Bajenov
# Date: Dec 2, 2023

# A script that collects user input for a course's code, 
# name, number of students, and tuition fee.
# Then displays the course details in a formatted table.


# Importing the Course class from the course module
from course import Course

# Function to prompt for a course code
def prompt_course_code(prompt):
    return input(prompt)

# Function to prompt for the number of students, also checking
# for exceptions
def prompt_students(prompt):
    while True:
        try:
            return int(input(prompt)) # Convert input to an integer
        except Exception as err:
            print(err) # Display error message if input is not a valid integer

# Function to prompt for the tuition fee, also checking
# for exceptions
def prompt_tuition(prompt):
    while True:
        try:
            return float(input(prompt)) # Convert input to a float
        except Exception as err:
            print(err) # Display error message if input is not a valid integer

# Function to prompt for a course name
def prompt_course_name(prompt):
    return input(prompt)

# Function to print course information in a table
def print_course_info(course):
    print("-----------------------------------------------------")
    print("Course Code  Course Name  Students  Fee     Total")
    print("-----------------------------------------------------")
    print(course) # Print the course details
    print("-----------------------------------------------------")

# Main function to run the program
def main():
    # Prompting for course information
    code = prompt_course_code("Enter course code: ")
    name = prompt_course_name("Enter course name: ")
    students = prompt_students("Enter number of students: ")

    # Checking the number of students (should be positive)
    while students < 0:
        print("Error: Number of students must be positive!")
        students = prompt_students("Enter number of students: ")

    fee = prompt_tuition("Enter tuition fee: ") # Prompt for tuition fee

    # Checking the tuition fee (should be positive)
    while fee < 0:
        print("Error: Tuition fee must be positive!")
        fee = prompt_tuition("Enter tuition fee: ")

     # Creating a Course object with the provided information
    course = Course(code, name, students, fee)
    # Printing the course information in the table
    print_course_info(course)

# Check if the script is run directly and execute the main function
if __name__ == "__main__":
    main()
