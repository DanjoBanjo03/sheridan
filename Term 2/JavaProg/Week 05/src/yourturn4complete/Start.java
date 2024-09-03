package yourturn4complete;

public class Start {
    public static void main(String[] args)
    {
        /*  ⁡⁢⁣⁢Read Me!⁡
         Write an Enumerated Type  called Month that contains each month and write an additional method called getNumDays that accepts an int representing the year and returns an int representing  how many days are in that month.  Remember that years that are evenly divisible by 4 are leap years so FEB would have 29 days on those years.
        
         Hint - See the code below to see how modulus works in Java
        
         Next, write a class called CalendarGenerator that takes an int into its constructor that it uses to set the year for the calendar and has a method called printMonth that will accept a Month and will print out the month name and each day of the month.  
        
         When your code is correct, the output will look like this:
         
         Java modulus (remainder) Note that things that divide evenly into 10 have a remainder of 0
        0
        2
        0
        4
        1
        FEB:   1    2    3    4    5    6    7    8    9    10    11    12    13    14    15    16    17    18    19    20    21    22    23    24    25    26    27    28    
        APR:   1    2    3    4    5    6    7    8    9    10    11    12    13    14    15    16    17    18    19    20    21    22    23    24    25    26    27    28    29    30    
        FEB:   1    2    3    4    5    6    7    8    9    10    11    12    13    14    15    16    17    18    19    20    21    22    23    24    25    26    27    28    29    
         */
        System.out
                .println("Java modulus (remainder) Note that things that divide evenly into 10 have a remainder of 0");
        System.out.println(10 % 5);
        System.out.println(10 % 4);
        System.out.println(10 % 2);
        System.out.println(10 % 6);
        System.out.println(10 % 3);

        CalendarGenerator cal1 = new CalendarGenerator(2023);
        cal1.printMonth(Month.FEB);
        cal1.printMonth(Month.APR);

        CalendarGenerator cal2 = new CalendarGenerator(2024);
        cal2.printMonth(Month.FEB);
    }
}
