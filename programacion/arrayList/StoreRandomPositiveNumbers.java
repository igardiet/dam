import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class StoreRandomPositiveNumbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        int n = 10;
        for (int i = 0; i < n; i++)
        {
            int randomNumber = random.nextInt(100) + 1;
            numbers.add(randomNumber);
        }

        System.out.println("ArrayList values:");
        for (int number : numbers)
        {
            System.out.println(number);
        }

        if (!numbers.isEmpty())
        {
            System.out.println("First value: " + numbers.get(0));
            System.out.println("Last value: " + numbers.get(numbers.size() - 1));
        } else
        {
            System.out.println("The ArrayList is empty.");
        }

        System.out.println("Would you like to add an additional value? (Yes/No)");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("yes"))
        {
            System.out.println("Enter the new value:");
            int newValue;
            while (true)
            {
                try
                {
                    newValue = scanner.nextInt();
                    break;
                } catch (Exception e)
                {
                    System.out.println("Invalid input. Please enter an integer.");
                    scanner.nextLine();
                }
            }
            numbers.add(newValue);
            System.out.println("New value successfully saved!");
        } else if (answer.equalsIgnoreCase("no"))
        {
            System.out.println("Good bye!");
        } else
        {
            System.out.println("Invalid option. Exiting program.");
        }

        scanner.close();
    }
}