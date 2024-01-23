# Assignment 4
# Author: Daniel Bajenov
# Date: Dec 2, 2023

# This defines the Course class, It includes methods 
# for attribute manipulation, error handling for 
# non-negative values, and formatting for displaying course details.


class Course:
    # Initialize the Course object with course code, name, students, and fee
    def __init__(self, course_code, course_name, 
                 num_of_students=0, tuition_fee=0):
        self.__course_code = course_code # Store course code
        self.__course_name = course_name # Store course name
        self.__num_of_students = num_of_students # Store number of students
        self.__tuition_fee = tuition_fee # Store tuition fee

    # Getter method to retrieve the course code
    def get_course_code(self):
        return self.__course_code

    # Setter method to set the course code
    def set_course_code(self, course_code):
        self.__course_code = course_code

    # Getter method to retrieve the course name
    def get_course_name(self):
        return self.__course_name

    # Setter method to set the course name
    def set_course_name(self, course_name):
        self.__course_name = course_name

    # Getter method to retrieve the number of students
    def get_num_of_students(self):
        return self.__num_of_students

    # Setter method to set the number of students
    def set_num_of_students(self, num_of_students):
        if num_of_students < 0:
            # Raise exception for negative student count
            raise ValueError("Number of students must be positive!")
        self.__num_of_students = num_of_students # Set the number of students

    # Getter method to retrieve the tuition fee
    def get_tuition_fee(self):
        return self.__tuition_fee
    
    # Setter method to set the tuition fee
    def set_tuition_fee(self, tuition_fee):
        if tuition_fee < 0:
            # Raise exception for negative tuition fee
            raise ValueError("Tuition fee must be positive!")
        self.__tuition_fee = tuition_fee # Set the tuition fee

    # Method to calculate the total tuition amount
    def get_tuition_total(self):
        return self.__num_of_students * self.__tuition_fee

    # Method to format the Course object as a string
    def __str__(self):
        return (f"{self.get_course_code():<13}{self.get_course_name():<13}"
                f"{self.get_num_of_students():<10}{self.get_tuition_fee():<7}"
                f"{self.get_tuition_total():>10,.2f}")
