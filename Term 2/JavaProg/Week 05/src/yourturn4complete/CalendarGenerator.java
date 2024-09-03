package yourturn4complete;

public class CalendarGenerator {

    private int year;

    public CalendarGenerator(int year) {
        this.year = year;
    }

    public void printMonth(Month month)
    {
        System.out.print(month + ":   ");
        for (int i = 1; i <= month.getNumDays(year); i++)
        {
            System.out.print(i + "    ");
        }
        System.out.println();
    }
}