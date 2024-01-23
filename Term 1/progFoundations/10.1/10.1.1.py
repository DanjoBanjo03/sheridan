def main():
    grades = [85, 90, 78, 92, 98]
    avgGrades = calcAvg(grades)
    print(f'Average grade is: {avgGrades}')

def calcAvg(grades):
    return sum(grades) / len(grades)

main()