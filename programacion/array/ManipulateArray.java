package array;

public class ManipulateArray
{
    public static void main(String[] args)
    {
        int[] numbers = { 10, 20, 30, 40, 50 };

        numbers[2] = 35;

        System.out.println("Updated array:");
        for (int number : numbers)
        {
            System.out.println(number);
        }
    }
}