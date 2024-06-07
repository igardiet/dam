package array;

import java.util.Scanner;

public class StringArray
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[3];

        for (int i = 0; i < names.length; i++)
        {
            System.out.println("Enter element nº " + (i + 1) + ":");
            names[i] = scanner.nextLine();
        }

        System.out.println("The entered names are:");

        for (int i = 0; i < names.length; i++)
        {
            System.out.println((i + 1) + ". " + names[i]);
        }

        scanner.close();
    }
}