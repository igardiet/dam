// MULTIPLICATION TABLE

package extra;

import java.util.Scanner;

public class Ex13
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number;
        do
        {
            System.out.println("Enter a number:");
            number = scanner.nextInt();

            if (number != 0)
            {
                for (int i = 1; i <= 10; i++)
                {
                    int result = number * i;
                    System.out.println(number + " * " + i + " = " + result);
                }
            } else
            {
                System.out.println("Exiting program...");
            }
        } while (number != 0);

        scanner.close();
    }
}