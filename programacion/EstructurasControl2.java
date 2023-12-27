import java.util.Scanner;

public class EstructurasControl2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int number = scanner.nextInt();

        boolean check = number % 2 == 0;

        if (check == true)
        {
            System.out.println(number + " is even");
        } else
        {
            System.out.println(number + " is odd");
        }
    }
}