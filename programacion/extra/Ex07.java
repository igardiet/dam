package extra;

import java.util.Scanner;

public class Ex07
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int integer = scanner.nextInt();

        switch (integer % 2)
        {
        case 0:
            System.out.println("The number is EVEN");
            break;
        default:
            System.out.println("The number is ODD");
            break;
        }

        scanner.close();
    }
}