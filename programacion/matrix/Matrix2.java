package matrix;

public class Matrix2
{
    public static void main(String[] args)
    {
        int[][] numbers = new int[][] { { 3, 4, 5, 7, 8 }, { 0, 0, 0, 0 }, { 1, 1, 1, 1 }, { 6, 6, 6, -1 } };

        int max = numbers[0][0];
        int min = numbers[0][0];
        for (int[] row : numbers)
        {
            for (int num : row)
            {
                if (num > max)
                {
                    max = num;
                }
                if (num < min)
                {
                    min = num;
                }
            }
        }
        System.out.println("El mayor valor es: " + max);
        System.out.println("El menor valor es: " + min);

        System.out.print("{");
        for (int col = 0; col < numbers[0].length; col++)
        {
            System.out.print(numbers[0][col]);
            if (col < numbers[0].length - 1)
            {
                System.out.print(" ");
            }
        }
        System.out.println("}");

        System.out.print("{");
        for (int col = 0; col < numbers[numbers.length - 1].length; col++)
        {
            System.out.print(numbers[numbers.length - 1][col]);
            if (col < numbers[numbers.length - 1].length - 1)
            {
                System.out.print(" ");
            }
        }
        System.out.println("}");
    }
}