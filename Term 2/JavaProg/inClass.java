import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers: ");

        input.close();

        int number = input.nextInt();
        int max = number;
        int count = 1;

        while (number != 0) {
            number = input.nextInt();
            if (number > max) {
                max = number;
                count = 1;
            } else if (number == max) {
                count++;
            }
        }

        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + count);

        
    }
}

class q2 {
    public static void main(String[] args) {
        boolean[] lockers = new boolean[100];

        for (int student = 1; student <= 100; student++) {
            for (int locker = student - 1; locker < 100; locker += student) {
                lockers[locker] = !lockers[locker]; 
            }
        }

        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i]) {
                System.out.println("Locker " + (i + 1) + " is open");
            }
        }
    }
}

class q3 {
    private int value;

    public q3(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return isEven(value);
    }

    public boolean isOdd() {
        return isOdd(value);
    }

    public boolean isPrime() {
        return isPrime(value);
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static boolean isPrime(int value) {
        if (value <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isEven(q3 integer) {
        return integer.isEven();
    }

    public static boolean isOdd(q3 integer) {
        return integer.isOdd();
    }

    public static boolean isPrime(q3 integer) {
        return integer.isPrime();
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(q3 integer) {
        return this.value == integer.getValue();
    }

    public static int parseInt(char[] chars) {
        return parseInt(new String(chars));
    }

    public static int parseInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        q3 n1 = new q3(5);
        System.out.println("n1 is even? " + n1.isEven());
        System.out.println("n1 is prime? " + n1.isPrime());
        System.out.println("15 is prime? " + q3.isPrime(15));
        char[] chars = {'3', '5', '3', '9'};
        System.out.println(q3.parseInt(chars));
        String s = "3539";
        System.out.println(q3.parseInt(s));
        q3 n2 = new q3(24);
        System.out.println("n2 is odd? " + n2.isOdd());
        System.out.println("45 is odd? " + q3.isOdd(45));
        System.out.println("n1 is equal to n2? " + n1.equals(n2));
        System.out.println("n1 is equal to 5? " + n1.equals(5));
    }
}



class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter a sequence of numbers ending with 0:");

        int input;
        while ((input = scanner.nextInt()) != 0) {
            numbers.add(input);
        }

        Integer maxNumber = max(numbers);
        if (maxNumber != null) {
            System.out.println("The maximum number is: " + maxNumber);
        } else {
            System.out.println("The list is empty.");
        }
        scanner.close();
    }

    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.size() == 0) {
            return null;
        }

        Integer max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }
}

class q5 {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(new Loan(1000, 5.0, 2));
        objects.add(new Date());
        objects.add("Hello, World!");
        objects.add(new Circle(3.5));

        for (Object obj : objects) {
            System.out.println(obj.toString());
        }
    }

    static class Loan {
        private double amount;
        private double annualInterestRate;
        private int years;

        public Loan(double amount, double annualInterestRate, int years) {
            this.amount = amount;
            this.annualInterestRate = annualInterestRate;
            this.years = years;
        }

        @Override
        public String toString() {
            return "Loan: amount=" + amount + ", annualInterestRate=" + annualInterestRate + ", years=" + years;
        }
    }

    static class Circle {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public String toString() {
            return "Circle: radius=" + radius;
        }
    }
}

class q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextInt());
        }

        removeDuplicate(list);

        System.out.print("The distinct integers are: ");
        for (Integer num : list) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (Integer num : list) {
            if (!temp.contains(num)) {
                temp.add(num);
            }
        }
        list.clear();
        list.addAll(temp);
    }
}


class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
    private double side;

    public Octagon(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    @Override
    public double getPerimeter() {
        return 8 * side;
    }

    @Override
    public int compareTo(Octagon o) {
        if (this.getArea() > o.getArea())
            return 1;
        else if (this.getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    public static void main(String[] args) {
        Octagon octagon1 = new Octagon(5);
        System.out.println("Octagon 1:");
        System.out.println("Area: " + octagon1.getArea());
        System.out.println("Perimeter: " + octagon1.getPerimeter());

        Octagon octagon2 = (Octagon) octagon1.clone();
        System.out.println("\nOctagon 2 (cloned from Octagon 1):");
        System.out.println("Area: " + octagon2.getArea());
        System.out.println("Perimeter: " + octagon2.getPerimeter());

        int comparisonResult = octagon1.compareTo(octagon2);
        if (comparisonResult > 0) {
            System.out.println("\nOctagon 1 has a larger area than Octagon 2.");
        } else if (comparisonResult < 0) {
            System.out.println("\nOctagon 2 has a larger area than Octagon 1.");
        } else {
            System.out.println("\nOctagon 1 and Octagon 2 have the same area.");
        }
    }
}

abstract class GeometricObject {
    public abstract double getArea();

    public abstract double getPerimeter();
}
