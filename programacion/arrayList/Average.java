import java.util.Scanner;
import java.util.ArrayList;

public class Average
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Enter number " + i + ":");
            int number = scanner.nextInt();
            numbers.add(number);
        }

        double sum = 0.0;

        for (int number : numbers)
        {
            sum += number;

        }

        double average = sum / numbers.size();
        System.out.println("The average of the array is: " + average);

        System.out.println("All numbers entered:");
        for (int number : numbers)
        {
            System.out.println(number);
        }

        scanner.close();
    }
}