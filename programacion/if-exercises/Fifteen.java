import java.util.Scanner;

// Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media,
// la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden
// más de 1.75.
public class Fifteen
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int students = 5;
        int ageSum = 0, over18Quantity = 0, over175HeightQuantity = 0;

        for (int i = 1; i <= students; i++)
        {
            System.out.println("Student data " + i + ":");
            System.out.println("Age:");
            int age = scanner.nextInt();

            System.out.println("Height (in meters):");
            double height = scanner.nextDouble();

            ageSum += age;

            if (age > 18)
            {
                over18Quantity++;
            }

            if (height > 1.75)
            {
                over175HeightQuantity++;
            }
        }
        double averageAge = (double) ageSum / students;

        System.out.println("Average age: " + averageAge);
        System.out.println("Students over 18: " + over18Quantity);
        System.out.println("Students with a height over 175cm: " + over175HeightQuantity);

        scanner.close();
    }
}