package array;

public class ArraySum
{
    public static void main(String[] args)
    {
        double[] numbers = { 2.5, 3.5, 1.0, 1.5, 1.5 };
        double sum = 0.0;
        for (double number : numbers)
        {
            sum += number;
        }

        System.out.println("Total sum: " + sum);
    }
}