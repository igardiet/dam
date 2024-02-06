import java.util.Scanner;

// Pedir dos números y decir si uno es múltiplo del otro.
public class TwoNumMultiple
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int number2 = scanner.nextInt();

        if (isMultiple(number1, number2))
        {
            System.out.println(number1 + " is a multiple of " + number2);
        } else if (isMultiple(number2, number1))
        {
            System.out.println(number2 + " is a multiple of " + number1);
        } else
        {
            System.out.println("Neither of them is a multiple of each other");
        }

        scanner.close();
    }

    private static boolean isMultiple(int number1, int number2)
    {
        return number2 != 0 && number1 % number2 == 0;
    }
}