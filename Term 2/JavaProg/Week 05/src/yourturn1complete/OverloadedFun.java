package yourturn1complete;

public class OverloadedFun {
    public int findLargest(int num1, int num2)
    {
        return (num1 > num2) ? num1 : num2;
    }

    public int findLargest(int num1, int num2, int num3)
    {
        return (findLargest(num1, num2) > num3) ? findLargest(num1, num2) : num3;
    }

    public int findLargest(int num1, int num2, int num3, int num4)
    {
        return (findLargest(num1, num2, num3) > num4) ? findLargest(num1, num2, num3) : num4;
    }

    public int findLargest(int num1, int num2, int num3, int num4, int num5)
    {
        return (findLargest(num1, num2, num3, num4) > num5) ? findLargest(num1, num2, num3, num4) : num5;
    }
}
