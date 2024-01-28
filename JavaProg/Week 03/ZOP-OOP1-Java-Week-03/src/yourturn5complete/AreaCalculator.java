package yourturn5complete;

public class AreaCalculator {

    public void printOutFormulas()
    {
        System.out.println("Area of Rectangle = length * width");
        System.out.println("Area of Square = length * length");
        System.out.println("Area of Circle = PI *radius *radius ");
        System.out.println("Area of Triangle = .5*base * height");
    }

    public double areaOfRectangle(double length, double width)
    {
        return length * width;
    }

    //hmmm...tricky!
    public double areaOfSquare(double length)
    {
        return areaOfRectangle(length, length);
    }

    public double areaOfCircle(double radius)
    {
        return Math.PI * radius * radius;
    }

    public double areaOfTriangle(double base, double height)
    {
        return .5 * base * height;
    }

}
