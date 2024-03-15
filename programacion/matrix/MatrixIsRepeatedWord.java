package matrix;

import java.util.Scanner;

public class MatrixIsRepeatedWord
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word: ");

        String word = scanner.nextLine();

        char[] letters = word.toCharArray();
        boolean isRepeated = false;

        for (int i = 0; i < letters.length; i++)
        {
            isRepeated = false;

            for (int j = i + 1; j < letters.length; j++)
            {
                if (letters[i] == letters[j])
                {
                    isRepeated = true;
                    break;
                }
            }

            if (isRepeated)
            {
                break;
            }
        }

        if (isRepeated)
        {
            System.out.println("The word contains repeated letters.");
        } else
        {
            System.out.println("The word does not contain repeated letters.");
        }

        scanner.close();
    }
}