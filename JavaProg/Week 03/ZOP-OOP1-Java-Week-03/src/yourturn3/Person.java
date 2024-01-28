package yourturn3;

public class Person {
    public String name;
    public int age;

    public void eat()
    {
        int a = 100;
        System.out.println("Yumm!");
    }

    public void sleep()
    {
        int a = 1000;
        System.out.println("zzz...");
    }

    public void eatAndSleep()
    {
        int a = 10000;
        this.eat();
        this.sleep();
    }
}
