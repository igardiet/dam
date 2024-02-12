package string;

import java.util.Scanner;

public class Line
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = scanner.nextLine();

        String[] words = text.split(" ");
        for (String word : words)
        {
            System.out.println(word);
        }

        scanner.close();
    }
}