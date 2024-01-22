from employee import Employee

def main():
    print(f'Number of employees before instattation:\
          {Employee.get_employee_count()}')
    
    emp1 = Employee('Joe', 'Python')
    emp2 = Employee('Jane', 'Doe')

    print(f'Number of employees after instatation: {emp1.get_employee_count()}')
    print(f'Number of employees after instatation: {emp2.get_employee_count()}')
    print(f'Number of employees after instatation: {emp1.get_employee_count()}')

if __name__ == '__main__':
    main()