package extra;

import java.util.Scanner;

public class Ex02
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println(num1 + " + " + num2 + " = " + sum);

        scanner.close();
    }
}