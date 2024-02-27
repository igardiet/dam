import java.util.Random;
import java.util.Scanner;

public class TwoValuesRandomNumbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number:");
        int secondNumber = scanner.nextInt();

        generateRandomValuesInBetweenTwoNumbers(firstNumber, secondNumber);

        scanner.close();
    }

    public static void generateRandomValuesInBetweenTwoNumbers(int min, int max)
    {
        Random random = new Random();

        System.out.println("Generated random numbers between: " + min + " and " + max + ":");
        for (int i = 0; i < 10; i++)
        {
            int randomNumber = random.nextInt(max - min + 1) + min;
            System.out.println(randomNumber);
        }
    }
}