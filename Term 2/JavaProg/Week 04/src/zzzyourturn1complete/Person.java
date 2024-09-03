package zzzyourturn1complete;

public class Person {
    private String name;
    private int luckyNumber;
    private double heightInMeters;

    public Person(String name, int luckyNumber, double heightInMeters) {
        this.name = name;
        this.luckyNumber = luckyNumber;
        this.heightInMeters = heightInMeters;
    }

    public Person() {

    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getLuckyNumber()
    {
        return luckyNumber;
    }

    public void setLuckyNumber(int luckyNumber)
    {
        this.luckyNumber = luckyNumber;
    }

    public double getHeightInMeters()
    {
        return heightInMeters;
    }

    public void setHeightInMeters(double heightInMeters)
    {
        this.heightInMeters = heightInMeters;
    }

    public String getDescription()
    {
        String returnValue = "Name: " + name + "\nHeight: " + heightInMeters + "\nLuckyNumber: " + luckyNumber + "\n\n";
        return returnValue;
    }

}
