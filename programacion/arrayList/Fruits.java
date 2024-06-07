import java.util.Scanner;
import java.util.ArrayList;

public class Fruits
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> fruits = new ArrayList<>();

        System.out.println("Enter the different type of fruits you would like to buy:");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < quantity; i++)
        {
            System.out.println("Enter the fruit nº " + (i + 1) + ":");
            String fruit = scanner.nextLine();
            fruits.add(fruit);
        }

        System.out.println("Your list: " + fruits);

        for (String fruit : fruits)
        {
            if (fruit.equals("Apple"))
            {
                System.out.println("There is an apple on the list!");
            }
        }

        System.out.println("Insert index of element you would like to remove:");
        int index = scanner.nextInt();
        scanner.nextLine();
        fruits.remove(index);
        System.out.println("Updated ArrayList: " + fruits);

        scanner.close();
    }
}