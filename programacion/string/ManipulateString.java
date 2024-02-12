package string;

import java.util.Scanner;

public class ManipulateString
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a short text:");
        String input = scanner.nextLine();

        printFirstHalf(input);
        printLastCharacter(input);
        printReverse(input);
        printCharactersWithDash(input);
        printVowelCount(input);
        checkPalindrome(input);

        scanner.close();
    }

    private static void printFirstHalf(String str)
    {
        int length = str.length();
        int halfLength = length / 2;
        String firstHalf = str.substring(0, halfLength);
        System.out.println("String first half: " + firstHalf);
    }

    private static void printLastCharacter(String str)
    {
        char lastCharacter = str.charAt(str.length() - 1);
        System.out.println("Last string character: " + lastCharacter);
    }

    private static void printReverse(String str)
    {
        StringBuilder reversed = new StringBuilder(str).reverse();
        System.out.println("Reversed string: " + reversed);
    }

    private static void printCharactersWithDash(String str)
    {
        String joined = String.join("-", str.split(""));
        System.out.println("Every character separated by hyphen: " + joined);
    }

    private static void printVowelCount(String str)
    {
        long vowelCount = str.chars().mapToObj(ch -> (char) ch).filter(ch -> "AEIOUaeiou".indexOf(ch) != -1).count();
        System.out.println("String vowel quantity: " + vowelCount);
    }

    private static void checkPalindrome(String str)
    {
        boolean isPalindrome = true;
        int length = str.length();
        for (int i = 0; i < length / 2; i++)
        {
            if (str.charAt(i) != str.charAt(length - i - 1))
            {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome)
        {
            System.out.println("isPalindrome: True");
        } else
        {
            System.out.println("isPalindrome: False");
        }
    }
}