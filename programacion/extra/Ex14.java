package extra;

public class Ex14
{
    public static void main(String[] args)
    {

        System.out.println("Enter array length:");

        int[] numbers = { 1, 2, 3, 4, 5 };

        int even = 0;

        for (int number : numbers)
        {
            if (number % 2 == 0)
            {
                even += number;
            }
        }

        System.out.println("The sum of even numbers is: " + even);
    }
}