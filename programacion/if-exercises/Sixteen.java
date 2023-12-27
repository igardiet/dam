import java.util.Scanner;

// Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número.

public class Sixteen
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 10:");
        int number = scanner.nextInt();

        if (number < 0 || number > 10)
        {
            System.out.println("Error, the number must be in between 0 and 10.");
        } else
        {
            System.out.println("Multiplication table of " + number + ":");
            for (int i = 1; i <= 10; i++)
            {
                int result = i * number;
                System.out.println(number + " X " + i + " = " + result);
            }
        }
        scanner.close();
    }
}