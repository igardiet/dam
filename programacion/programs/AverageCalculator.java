package programs;

import java.util.Scanner;

public class AverageCalculator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of integers to average:");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] numbers = new int[count];

        for (int i = 0; i < count; i++)
        {
            System.out.println("Enter number " + (i + 1) + ":");
            numbers[i] = scanner.nextInt();
        }

        double sum = 0.0;
        for (int number : numbers)
        {
            sum += number;
        }

        double average = sum / count;

        System.out.println("Average of entered numbers: " + average);

        scanner.close();
    }
}