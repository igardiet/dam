import java.util.Scanner;
import java.util.ArrayList;

public class StoreIntegers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("How many integers would you like to add?");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < quantity; i++)
        {
            System.out.println("Enter number " + (i + 1) + ":");
            int integers = scanner.nextInt();
            scanner.nextLine();
            list.add(integers);
        }

        System.out.println("Select desired index to be removed:");
        int index = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Original ArrayList: " + list);
        list.remove(index);
        System.out.println("Updated ArrayList: " + list);

        scanner.close();
    }
}