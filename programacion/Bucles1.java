import java.util.Scanner;

public class Bucles1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int number;

        do
        {
            System.out.println("Enter a number (enter 0 to end the game):");
            number = scanner.nextInt();

            if (number != 0)
            {
                if (isPrime(number))
                {
                    System.out.println(number + " is a prime number.");
                } else
                {
                    System.out.println(number + " is not a prime number.");
                }
            } else
            {
                System.out.println("Goodbye!");
            }

        } while (number != 0);

        scanner.close();
    }

    private static boolean isPrime(int n)
    {
        if (n <= 1)
        {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}