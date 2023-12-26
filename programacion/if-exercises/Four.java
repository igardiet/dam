import java.util.Scanner;

// Pedir tres números y mostrarlos ordenados de major a minor.
public class Four
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the 1st number:");
        int number1 = scanner.nextInt();

        System.out.println("Enter the 2nd number:");
        int number2 = scanner.nextInt();

        System.out.println("Enter the 3rd number:");
        int number3 = scanner.nextInt();

        orderedNumbers(number1, number2, number3);

        scanner.close();
    }

    private static void orderedNumbers(int num1, int num2, int num3)
    {
        int major, medium, minor;

        if (num1 >= num2 && num1 >= num3)
        {
            major = num1;
            medium = (num2 >= num3) ? num2 : num3;
            minor = (num2 >= num3) ? num3 : num2;
        } else if (num2 >= num1 && num2 >= num3)
        {
            major = num2;
            medium = (num1 >= num3) ? num1 : num3;
            minor = (num1 >= num3) ? num3 : num1;
        } else
        {
            major = num3;
            medium = (num1 >= num2) ? num1 : num2;
            minor = (num1 >= num2) ? num2 : num1;
        }

        System.out.println("Numbers ordered from higher to lower: " + major + ", " + medium + ", " + minor);
    }
}