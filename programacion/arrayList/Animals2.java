import java.util.Scanner;
import java.util.ArrayList;

public class Animals2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> animals = new ArrayList<>();

        System.out.println("Enter a list of animals (type 'exit' to quit the program):");

        while (true)
        {
            String animal = scanner.nextLine();

            if (animal.equalsIgnoreCase("exit"))
            {
                break;
            }

            animals.add(animal);
        }

        System.out.println("List of animals:");

        for (String animal : animals)
        {
            System.out.println(animal);
        }

        System.out.println("Number of animals: " + animals.size());

        scanner.close();
    }
}