import java.util.Scanner;

public class WeekIfElse
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number;

        do
        {
            System.out.println("Insert an integer between 1 and 7:");
            number = scanner.nextInt();

            if (number == 1)
                System.out.println("Monday");
            else if (number == 2)
                System.out.println("Tuesday");
            else if (number == 3)
                System.out.println("Wednesday");
            else if (number == 4)
                System.out.println("Thursday");
            else if (number == 5)
                System.out.println("Friday");
            else if (number == 6)
                System.out.println("Saturday");
            else if (number == 7)
                System.out.println("Sunday");
            else
                System.out.println("Wrong number, try again!");
        } while (number != 0);

        scanner.close();
    }
}