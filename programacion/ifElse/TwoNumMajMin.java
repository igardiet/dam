import java.util.Scanner;

// Pedir dos números y decir cual es el mayor o si son iguales.
public class TwoNumMajMin
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
            System.out.println(number1 + " is bigger than " + number2);
        } else if (number2 > number1)
        {
            System.out.println(number2 + " is bigger than " + number1);
        } else
        {
            System.out.println("Both numbers are the same one");
        }

        scanner.close();
    }
}