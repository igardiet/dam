import java.util.Scanner;

public class WeekSwitch
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number;

        do
        {
            System.out.println("Insert an integer between 1 and 7:");
            number = scanner.nextInt();

            switch (number)
            {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            case 0:
                System.out.println("Exiting program...");
                break;
            default:
                System.out.println("Invalid option, try again!");
                break;
            }
        } while (number != 0);

        scanner.close();
    }
}