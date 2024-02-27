package extra;

import java.util.Scanner;

public class Ex05
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        double number = scanner.nextDouble();

        if (number > 0)
        {
            System.out.println("The number is POSITIVE");
        } else if (number < 0)
        {
            System.out.println("The number is NEGATIVE");
        } else
        {
            System.out.println("The number is 0");
        }

        scanner.close();
    }
}