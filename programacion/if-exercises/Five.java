import java.util.Scanner;

// Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien.
public class Five
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter note (from 0 to 10):");
        double note = scanner.nextDouble();

        if (note >= 0 && note <= 2)
        {
            System.out.println("Awful!");
        } else if (note >= 3 && note <= 4)
        {
            System.out.println("Bad!");
        } else if (note >= 5 && note <= 6)
        {
            System.out.println("Average");
        } else if (note >= 7 && note <= 8)
        {
            System.out.println("Great job!");
        } else if (note >= 9 && note <= 10)
        {
            System.out.println("Outstanding!");
        } else
        {
            System.out.println("Error, enter a real number from 0 to 10");
        }

        scanner.close();
    }
}