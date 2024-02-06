// Pedir un número N, y mostrar todos los números del 1 al N.

package programs;

import java.util.Scanner;

public class OneToN
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.println("Enter a number:");
        number = scanner.nextInt();

        System.out.println("Numbers from 1 to " + number + ":");

        if (number > 0)
        {
            for (int i = 1; i <= number; i++)
            {
                System.out.println(i);
            }
        } else if (number < 0)
        {
            for (int i = 0; i <= Math.abs(number); i++)
            {
                System.out.println("-" + i);
            }
        } else
        {
            System.out.println("There are no numbers to show");
        }
        scanner.close();
    }
}