package programs;

import java.util.Scanner;

public class EuroConverter
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount in euros: ");
        double amount = scanner.nextDouble();

        System.out.println("Select the currency to convert, P for pounds or E for euros: ");
        char currency = scanner.next().charAt(0);

        double result = 0.0;

        if (currency == 'P' || currency == 'p')
        {
            result = amount * 0.85;
            System.out.println("The amount in pounds is: " + result);
        } else if (currency == 'E' || currency == 'e')
        {
            result = amount;
            System.out.println("The amount in euros is: " + result);
        } else
        {
            System.out.println("Invalid option, try again");
        }

        scanner.close();
    }
}