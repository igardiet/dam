package extra;

import java.util.Scanner;

public class Ex12
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a letter:");
        String letter = scanner.next();

        letter = letter.toLowerCase();

        if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u"))
        {
            System.out.println("The char is a vowel");
        } else
        {
            System.out.println("The char is a consonant");
        }

        scanner.close();
    }
}