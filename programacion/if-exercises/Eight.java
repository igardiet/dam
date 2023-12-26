import java.util.Scanner;
import java.util.Random;

// Realizar un juego para adivinar un número. Para ello pedir un número N,
// y luego ir pidiendo números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. El proceso termina cuando el usuario acierta.
public class Eight
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Random number between 1 and 100
        int attemptNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int userAttempt;

        System.out.println("Welcome! Guess a number between 1 and 100.");

        do
        {
            System.out.println("Enter your attempt:");
            userAttempt = scanner.nextInt();
            attempts++;

            if (userAttempt < attemptNumber)
            {
                System.out.println("The number is higher, try again");
            } else if (userAttempt > attemptNumber)
            {
                System.out.println("The number is lower, try again");
            }
        } while (userAttempt != attemptNumber);

        System.out.println("Congrats! You've guessed the number in " + attempts + " attempts.");

        scanner.close();
    }
}