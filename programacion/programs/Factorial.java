package programs;

public class Factorial
{
    public static void main(String[] args)
    {
        int firstNumber = 1;
        long firstFactorial = calculateFactorial(firstNumber);

        System.out.println("The factorial of " + firstNumber + " is: " + firstFactorial);

        int secondNumber = 2;
        long firstFactoria = calculateFactorial(secondNumber);

        System.out.println("The factorial of " + secondNumber + " is: " + firstFactoria);
    }

    private static long calculateFactorial(int n)
    {
        if (n == 0 || n == 1)
        {
            return 1;
        } else
        {
            long result = 1;
            for (int i = 2; i <= n; i++)
            {
                result *= i;
            }
            return result;
        }
    }
}