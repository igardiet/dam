package arrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class Animals
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> animals = new ArrayList<>();

        System.out.println("Enter animal names (type 'exit' to finish the program):");

        while (true)
        {
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("exit"))
            {
                break;
            }

            animals.add(name);
        }

        System.out.println("List of introduced animals:");

        for (String animal : animals)
        {
            System.out.println(animal);
        }

        System.out.println("Number of animals: " + animals.size());

        scanner.close();
    }
}