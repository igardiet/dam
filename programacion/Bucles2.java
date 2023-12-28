public class Bucles2
{
    public static void main(String[] args)
    {
        final int numbersQuantity = 10;

        int previousNumber = 0;
        int currentNumber = 1;

        System.out.println("The " + numbersQuantity + " first numbers of the Fibonacci series:");

        for (int i = 0; i < numbersQuantity; i++)
        {
            System.out.println(previousNumber);

            int nextNumber = previousNumber + currentNumber;

            previousNumber = currentNumber;
            currentNumber = nextNumber;
        }
    }
}