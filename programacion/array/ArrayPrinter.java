package array;

import java.util.Scanner;

public class ArrayPrinter
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 integers:");

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println("Enter number " + (i + 1) + ":");
            numbers[i] = scanner.nextInt();
        }

        for (int number : numbers)
        {
            System.out.print(number);
        }
        scanner.close();
    }
}