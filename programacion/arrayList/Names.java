import java.util.ArrayList;
import java.util.Scanner;

public class Names
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Add three names to the list:");
        for (int i = 1; i <= 3; i++)
        {
            String name = scanner.nextLine();
            names.add(name);
        }

        System.out.println("List of names:");

        for (int i = 0; i < names.size(); i++)
        {
            System.out.println((i + 1) + ". " + names.get(i));
        }

        scanner.close();
    }
}