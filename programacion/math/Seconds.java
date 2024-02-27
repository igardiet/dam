import java.util.Scanner;

public class Seconds
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean program = true;

        while (program)
        {
            System.out.println("Enter a value in seconds (or enter 'quit' to exit the program):");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("quit"))
            {
                program = false;
                System.out.println("Exiting program...");
            } else
            {
                try
                {
                    int seconds = Integer.parseInt(input);
                    int minute = calculateMinute(seconds);
                    System.out.println("The current minute is: " + minute);
                } catch (NumberFormatException e)
                {
                    System.out.println("Enter a valid number of seconds.");
                }
            }
        }
        scanner.close();
    }

    public static int calculateMinute(int seconds)
    {
        int minute = (int) Math.ceil(seconds / 60.0);
        return minute;
    }
}