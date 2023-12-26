import java.util.Scanner;

// Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
public class Seven
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int number;

        do
        {
            System.out.println("Enter an integer (0 to exit):");
            number = scanner.nextInt();

            if (number != 0)
            {
                if (number % 2 == 0)
                {
                    System.out.println(number + " is even");
                } else
                {
                    System.out.println(number + " is odd");
                }
            }
        } while (number != 0);

        scanner.close();
    }
}