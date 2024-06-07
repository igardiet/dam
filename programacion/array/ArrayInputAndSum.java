package array;

import java.util.Scanner;

public class ArrayInputAndSum
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println("Enter number " + (i + 1) + ":");
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int number : numbers)
        {
            sum += number;
        }

        System.out.println("The sum of the elements of the array is: " + sum);

        scanner.close();
    }
}