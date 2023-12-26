import java.util.Scanner;

// Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.
public class Six
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int number;

        do
        {
            System.out.println("Enter an integer (0 to exit):");
            number = scanner.nextInt();

            if (number > 0)
            {
                System.out.println(number + " is positive");
            } else if (number < 0)
            {
                System.out.println(number + " is negative");
            } else
            {
                System.out.println("You entered 0, exiting program...");
            }
        } while (number != 0);

        scanner.close();
    }
}