package yourturn4complete;

public enum Month {
    JAN(31), FEB(28), MAR(31), APR(30), MAY(31), JUN(30), JUL(31), AUG(31), SEPT(30), OCT(31), NOV(30), DEC(31);

    private int numDays;

    private Month(int numDays) {
        this.numDays = numDays;
    }

    public int getNumDays(int year)
    {
        if (numDays == 28 && year % 4 == 0)
        {
            return numDays + 1;
        }
        return numDays;
    }

}
