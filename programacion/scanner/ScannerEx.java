import java.util.Scanner;

public class ScannerEx
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert your name: ");

        String name = scanner.next();

        System.out.println("Insert your surname: ");

        String surname = scanner.next();

        System.out.println("Good morning " + name + " " + surname);

        scanner.close();
    }
}