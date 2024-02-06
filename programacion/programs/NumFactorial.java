// Pedir un número y calcular su factorial.

package programs;

import java.util.Scanner;

public class NumFactorial
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to calculate its factorial:");
        int number = scanner.nextInt();

        long factorial = calculateFactorial(number);

        System.out.println("The factorial of " + number + " is: " + factorial);

        scanner.close();
    }

    private static long calculateFactorial(int number)
    {
        if (number < 0)
        {
            System.out.println("The factorial of a negative number cannot be calculated.");
            return -1;
        } else if (number == 0 || number == 1)
        {
            return 1;
        } else
        {
            long result = 1;
            for (int i = 2; i <= number; i++)
            {
                result *= i;
            }
            return result;
        }
    }
}