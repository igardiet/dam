import java.util.Scanner;

// Pedir un número e indicar si es positivo o negativo:
public class One
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a number:");
        double number = scanner.nextDouble();

        if (number > 0)
        {
            System.out.println(number + " is a positive number");
        } else if (number < 0)
        {
            System.out.println(number + " is a negative number");
        } else
        {
            System.out.println("Error, try again");
        }

        scanner.close();
    }
}