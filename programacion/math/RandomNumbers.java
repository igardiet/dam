import java.util.Random;
import java.util.Scanner;

public class RandomNumbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter desired quantity of random numbers to generate:");
        int quantity = scanner.nextInt();

        generateRandomNumbers(quantity);

        scanner.close();
    }

    public static void generateRandomNumbers(int quantity)
    {
        Random random = new Random();

        System.out.println("Random numbers generated:");
        for (int i = 0; i < quantity; i++)
        {
            System.out.println(random.nextInt());
        }
    }
}