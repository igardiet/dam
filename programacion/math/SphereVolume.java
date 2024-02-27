import java.util.Scanner;

public class SphereVolume
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sphere radius:");
        double radius = scanner.nextDouble();

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("The sphere volume is: " + volume);

        scanner.close();
    }
}