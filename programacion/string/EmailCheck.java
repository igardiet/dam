package string;

import java.util.Scanner;

public class EmailCheck
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your email address:");
        String email = scanner.nextLine();

        if (!email.contains("@"))
            System.out.println("Email address must contain a @.");
        else if (email.indexOf("@") != email.lastIndexOf("@"))
            System.out.println("Email address cannot have more than one '@'.");
        else if (!email.endsWith("."))
            System.out.println("Email address must end with a dot '.'.");
        else if (email.length() < 20)
            System.out.println("The email min length should be of 20 char.");
        else if (!email.equals(email.toLowerCase()))
            System.out.println("Email address must be in lower case.");
        else
            System.out.println("Email address is valid.");

        scanner.close();
    }
}