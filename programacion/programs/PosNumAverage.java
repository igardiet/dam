// Pedir números hasta que se introduzca uno negativo, y calcular la media de los números positivos. El 0 se considera número positivo.

package programs;

import java.util.Scanner;

public class PosNumAverage
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int number;
        int positiveSum = 0;
        int positiveQuantity = 0;

        System.out.println("Enter numbers. The process ends when a negative number is entered.");

        do
        {
            System.out.println("Enter a number:");
            number = scanner.nextInt();

            if (number >= 0)
            {
                positiveSum += number;
                positiveQuantity++;
            }
        } while (number >= 0);

        if (positiveQuantity > 0)
        {
            double averagePositive = (double) positiveSum / positiveQuantity;
            System.out.println("The average of the positive numbers is " + averagePositive);
        } else
        {
            System.out.println("No positive numbers were introduced.");
        }

        scanner.close();
    }
}