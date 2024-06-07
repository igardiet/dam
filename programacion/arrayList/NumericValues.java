import java.util.Scanner;
import java.util.ArrayList;

public class NumericValues
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter the number of whole numbers you want to enter:");
        int numberOfValues = scanner.nextInt();

        System.out.println("Enter whole numbers (-99 to exit):");

        for (int i = 0; i < numberOfValues; i++)
        {
            int input = scanner.nextInt();

            if (input == -99)
            {
                break;
            }

            numbers.add(input);
        }

        scanner.close();

        int arrayListLength = numbers.size();

        if (arrayListLength > 0)
        {
            int sum = 0;
            for (int number : numbers)
            {
                sum += number;
            }

            double average = (double) sum / arrayListLength;

            System.out.println("Total of read values: " + arrayListLength);
            System.out.println("Total sum: " + sum);
            System.out.println("Average: " + average);

            int countAboveAverage = 0;
            System.out.println("Numbers read:");
            for (int number : numbers)
            {
                System.out.println(number);
                if (number > average)
                {
                    countAboveAverage++;
                }
            }
            System.out.println("Numbers above average: " + countAboveAverage);
        } else
        {
            System.out.println("No numbers were entered.");
        }
    }
}