package deeperintomethods;

public class MethodDemonstrator {

    public void method1()
    {
        System.out.println("Hi from method1");
    }

    public void method2(int num1)
    {
        System.out.println("hi from method2 - " + num1 + " was passed into num1 when we called the method");
    }

    public void method3(int num1, String word)
    {
        System.out.println("hi from method2 - " + num1 + " and " + word + "  were passed into num1 and word when we called the method");
    }

    public int method4(int num1)
    {
        System.out.println("Hi from method4!  Method 4 had " + num1 + "passed into it and it will add 5 to it and then return that value");
        num1 += 5;
        return num1;
    }

    public String method5(String word)
    {
        String echo = "";
        for (int i = 0; i < 5; i++)
        {
            echo += " " + word;
        }
        return echo;
    }
}
