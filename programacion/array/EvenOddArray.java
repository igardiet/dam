package array;

public class EvenOddArray
{
    public static void main(String[] args)
    {
        int[] numbers = new int[57];

        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = i + 1;
        }

        int even = 0;
        int odd = 0;

        for (int number : numbers)
        {
            if (number % 2 == 0)
            {
                even++;
            } else
            {
                odd++;
            }
        }

        System.out.println("Number of cells containing even numbers: " + even);
        System.out.println("Number of cells containing odd numbers: " + odd);

    }
}