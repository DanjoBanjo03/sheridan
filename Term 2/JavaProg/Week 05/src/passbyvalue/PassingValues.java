package passbyvalue;

public class PassingValues {

    public void method1(int num1)
    {
        num1 = 10000;
        System.out.println(num1);
    }

    public int method2(int num1)
    {
        return num1 + 100;
    }

    public void method3(OurObject obj)
    {
        obj.setInstVar(5000);
    }
}
