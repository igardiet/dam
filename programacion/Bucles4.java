import java.util.Scanner;

public class Bucles4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int number;

        do
        {
            System.out.println("Enter a number between 0 and 999 (enter 0 to exit):");
            number = scanner.nextInt();

            if (number == 0)
            {
                System.out.println("Game over!");
            } else
            {
                int digits = countDigits(number);
                System.out.println("Number " + number + " has " + digits + " digits.");
            }
        } while (number != 0);

        scanner.close();
    }

    private static int countDigits(int n)
    {
        if (n == 0)
        {
            return 1;
        }

        int counter = 0;
        while (n != 0)
        {
            n /= 10;
            counter++;
        }
        return counter;
    }
}