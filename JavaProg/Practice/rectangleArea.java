import java.util.Scanner;

public class rectangleArea{
    public static void main(String[] args) {
        int area1, area2;
        Rect rect1 = new Rect();
        Rect rect2 = new Rect();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length: ");
        rect1.length = scan.next();
        System.out.println("Enter width: ");
        rect1.width = scan.next();
    }
}