import java.util.Scanner;

public class QuadraticEcuation
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coefficients a, b and c from the quadratic equation:");
        System.out.println("a:");
        double a = scanner.nextDouble();
        System.out.println("b:");
        double b = scanner.nextDouble();
        System.out.println("c:");
        double c = scanner.nextDouble();

        double[] solutions = calculateSolutions(a, b, c);

        System.out.println("The quadratic equation solutions are:");
        for (double solution : solutions)
        {
            System.out.println(solution);
        }
        scanner.close();
    }

    public static double[] calculateSolutions(double a, double b, double c)
    {
        double discriminating = b * b - 4 * a * c;

        if (discriminating > 0)
        {
            double discriminatingRoot = Math.sqrt(discriminating);
            double solution1 = (-b + discriminatingRoot) / (2 * a);
            double solution2 = (-b - discriminatingRoot) / (2 * a);
            return new double[]
            { solution1, solution2 };
        } else if (discriminating == 0)
        {
            double solution = -b / (2 * a);
            return new double[]
            { solution };
        } else
        {
            System.out.println("The ecuation has complex conjugate solutions, there are no real solutions");
            return new double[0];
        }
    }
}
