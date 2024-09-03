package yourturn2complete;

public enum Coin {
    NICKEL(.05), DIME(.1), QUARTER(.25);

    private double value;

    Coin(double value) {
        this.value = value;
    }

    public double getValue()
    {
        return value;
    }

}
