import java.util.Scanner;

public class Scan
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a word: ");
        String word = scanner.next();

        System.out.println("Insert a whole number: ");
        int number = scanner.nextInt();

        System.out.println("Insert a real number");
        Double real = scanner.nextDouble();

        System.out.println("The word you wrote is: " + word);
        System.out.println("The whole number you wrote is: " + number);
        System.out.println("The real number you wrote is: " + real);

        scanner.close();
    }
}