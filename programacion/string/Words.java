package string;

import java.util.Scanner;

public class Words
{
    private String chain;

    public Words(String chain)
    {
        this.chain = chain;
    }

    public void printFirstHalf()
    {
        int half = chain.length() / 2;
        System.out.println("First string half: " + chain.substring(0, half));
    }

    public void printLastCharacter()
    {
        System.out.println("Last character from string: " + chain.charAt(chain.length() - 1));
    }

    public void printReversedString()
    {
        StringBuilder reverse = new StringBuilder(chain).reverse();
        System.out.println("Reversed string: " + reverse);
    }

    public void printSeparatedChars()
    {
        System.out.println("Characters separated by hyphens:");
        for (int i = 0; i < chain.length(); i++)
        {
            System.out.println(chain.charAt(i));
            if (i < chain.length() - 1)
            {
                System.out.println("-");
            }
        }
        System.out.println();
    }

    public int countVowels()
    {
        int counter = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < chain.length(); i++)
        {
            if (vowels.contains(String.valueOf(chain.charAt(i))))
            {
                counter++;
            }
        }
        return counter;
    }

    public boolean isPalindrome()
    {
        String chainWithoutSpaces = chain.replaceAll("\\s", "").toLowerCase();
        int length = chainWithoutSpaces.length();
        for (int i = 0; i < length / 2; i++)
        {
            if (chainWithoutSpaces.charAt(i) != chainWithoutSpaces.charAt(length - 1 - i))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a group of two/three words:");
        String entry = scanner.nextLine();
        Words words = new Words(entry);

        System.out.println("\nResults:");
        words.printFirstHalf();
        words.printLastCharacter();
        words.printReversedString();
        words.printSeparatedChars();
        System.out.println("Vowel quantity: " + words.countVowels());
        System.out.println("Is it a palindrome?: " + words.isPalindrome());

        scanner.close();
    }
}