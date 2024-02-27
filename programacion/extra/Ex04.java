package extra;

import java.util.Scanner;

public class Ex04
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int integer = scanner.nextInt();

        if (integer % 2 == 0)
        {
            System.out.println("The number is EVEN");
        } else
        {
            System.out.println("The number is ODD");
        }

        scanner.close();
    }
}