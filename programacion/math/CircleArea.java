import java.util.Scanner;

public class CircleArea
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the circle radius:");
        double radius = scanner.nextDouble();

        double area = calculateCircleArea(radius);
        double roundedArea = round(area);

        System.out.println("The circle area is: " + roundedArea);

        scanner.close();
    }

    public static double calculateCircleArea(double radius)
    {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double round(double value)
    {
        return Math.round(value * 100.0) / 100.0;
    }
}