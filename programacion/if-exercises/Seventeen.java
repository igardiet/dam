import java.util.Scanner;

// Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (4) y suspensos.
public class Seventeen
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int approved = 0;
        int conditioned = 0;
        int suspensions = 0;

        System.out.println("Enter the grades of the six students:");

        for (int i = 1; i <= 6; i++)
        {
            System.out.println("Student grade " + i + ":");
            int grade = scanner.nextInt();

            if (grade >= 5)
            {
                approved++;
            } else if (grade == 4)
            {
                conditioned++;
            } else
            {
                suspensions++;
            }
        }

        System.out.println("Approved: " + approved);
        System.out.println("Conditioned: " + conditioned);
        System.out.println("Suspended: " + suspensions);

        scanner.close();
    }
}