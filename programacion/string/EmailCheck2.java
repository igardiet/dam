package string;

import java.util.Scanner;

public class EmailCheck2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter email:");
        String email = scanner.nextLine();

        if (!email.contains("@"))
            System.out.println("Email must contain the @");
        else if (!email.contains("."))
            System.out.println("Email must contain the .");
        else if (email.contains(" "))
            System.out.println("Email must not contain any spaces");
        else
            System.out.println("The email was correct!");

        scanner.close();
    }
}