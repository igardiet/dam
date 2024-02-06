import java.util.Scanner;

public class TwoNumIf
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int number2 = scanner.nextInt();

        if (number1 > number2)
        {
            System.out.println(number1 + " is greater than " + number2);
            System.out.println(number2 + " is less than " + number1);
        } else if (number1 < number2)
        {
            System.out.println(number2 + " is greater than " + number1);
            System.out.println(number1 + " is less than " + number2);
        } else
        {
            System.out.println("Both numbers are the same!");
        }

        scanner.close();
    }
}