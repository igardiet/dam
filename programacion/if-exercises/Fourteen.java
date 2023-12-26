import java.util.Scanner;

// Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros.
public class Fourteen
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int numberQuantity = 10;
        int positiveSum = 0, negativeSum = 0, zeroQuantity = 0;
        int positiveCounter = 0, negativeCounter = 0;

        for (int i = 0; i < numberQuantity; i++)
        {
            System.out.println("Enter number " + (i + 1) + ":");
            int number = scanner.nextInt();

            if (number > 0)
            {
                positiveSum += number;
                positiveCounter++;
            } else if (number < 0)
            {
                negativeSum += number;
                negativeCounter++;
            } else
            {
                zeroQuantity++;
            }
        }
        double averagePositive = positiveCounter > 0 ? (double) positiveSum / positiveCounter : 0;
        double averageNegative = negativeCounter > 0 ? (double) negativeSum / negativeCounter : 0;

        System.out.println("Average of positive numbers: " + averagePositive);
        System.out.println("Average of negative numbers: " + averageNegative);
        System.out.println("Zero quantity: " + zeroQuantity);

        scanner.close();
    }
}