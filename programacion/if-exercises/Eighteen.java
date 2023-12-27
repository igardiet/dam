import java.util.Scanner;

// Realizar un programa que muestre las tablas de multiplicar del 1 al 10.
public class Eighteen
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 10 to get its multiplication table:");
        int number = scanner.nextInt();

        System.out.println("Multiplication table of " + number + ":");

        if (number < 1 || number > 10)
        {
            System.out.println("Error, try again with an integer between 1 and 10.");
        } else
        {
            for (int i = 1; i <= 10; i++)
            {
                int result = i * number;
                System.out.println(number + " X " + i + " = " + result);
            }
        }

        scanner.close();
    }
}