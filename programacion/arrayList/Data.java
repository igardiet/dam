package arrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class Data
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Insert the first set of numbers");
        int set1 = scanner.nextInt();

        System.out.println("Insert the second set of numbers");
        int set2 = scanner.nextInt();

        System.out.println("Insert the third set of numbers");
        int set3 = scanner.nextInt();

        System.out.println("Insert the fourth set of numbers");
        int set4 = scanner.nextInt();

        System.out.println("Insert the fifth set of numbers");
        int set5 = scanner.nextInt();

        numbers.add(set1);
        numbers.add(set2);
        numbers.add(set3);
        numbers.add(set4);
        numbers.add(set5);

        System.out.println("Would you like to print the data? (Type 'yes' to print or any character to exit)");
        scanner.nextLine();
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("yes"))
        {
            for (int number : numbers)
            {
                System.out.println(number);
            }
        } else
        {
            System.out.println("Exiting...");
        }

        scanner.close();
    }
}