public class Bucles3
{
    public static void main(String[] args)
    {
        int number15 = 15;
        long factorial15 = calculateFactorial(number15);

        System.out.println("The factorial of " + number15 + " is: " + factorial15);

        int number4 = 4;
        long factorial4 = calculateFactorial(number4);

        System.out.println("The factorial of " + number4 + " is: " + factorial4);
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