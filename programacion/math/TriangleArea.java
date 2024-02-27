import java.util.Scanner;

public class TriangleArea
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the side A:");
        double a = scanner.nextDouble();

        System.out.println("Enter the length of the side B:");
        double b = scanner.nextDouble();

        System.out.println("Enter the length of the side C:");
        double c = scanner.nextDouble();

        double p = (a + b + c) / 2;

        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("The triangle area is: " + area);

        scanner.close();
    }
}