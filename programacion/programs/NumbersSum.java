// Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.

package programs;

import java.util.Scanner;

public class NumbersSum
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int number;
        int addition = 0;

        System.out.println("Enter numbers to add, enter 0 to exit.");

        do
        {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();

            if (number != 0)
            {
                addition += number;
            }
        } while (number != 0);

        System.out.println("The sum of the entered numbers is " + addition);

        scanner.close();
    }
}