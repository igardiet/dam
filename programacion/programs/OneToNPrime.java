// Realizar un programa que nos pida un número n, y nos diga cuantos números hay entre 1 y n que son primos.

package programs;

import java.util.Scanner;

public class OneToNPrime
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        int primeCounter = countPrime(number);

        System.out.println("There are " + primeCounter + " prime numbers between 1 and " + number);

        scanner.close();
    }

    private static boolean isPrime(int num)
    {
        if (num < 2)
        {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            if (num % i == 0)
            {
                return false;
            }
        }

        return true;
    }

    private static int countPrime(int number)
    {
        int counter = 0;

        for (int i = 1; i <= number; i++)
        {
            if (isPrime(i))
            {
                counter++;
            }
        }
        return counter;
    }

}