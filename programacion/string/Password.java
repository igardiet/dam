package string;

import java.util.Scanner;

public class Password
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        try
        {
            System.out.println("Enter password:");

            String password = scanner.nextLine();

            if (password.length() > 25)
            {
                System.out.println("The password cannot have more than 25 characters");
                return;
            }

            if (password.matches(".*[@\\.,$#&/].*"))
            {
                System.out.println("The password cannot contain special characters like @, ., $, #, &, /.");
                return;
            }

            char firstChar = Character.toUpperCase(password.charAt(0));
            char lastChar = Character.toUpperCase(password.charAt(password.length() - 1));

            System.out.println("First letter in upper case: " + firstChar);
            System.out.println("Last letter in upper case: " + lastChar);
        } finally
        {
            scanner.close();
        }
    }
}