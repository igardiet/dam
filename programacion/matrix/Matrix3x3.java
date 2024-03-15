package matrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Matrix3x3
{
    public static void main(String[] args)
    {
        int[][] matrix = new int[3][3];

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 9; i++)
        {
            numbers.add(i);
        }

        Collections.shuffle(numbers);

        int index = 0;
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = numbers.get(index++);
            }
        }

        System.out.println("Random Non-Repeating Matrix:");
        for (int[] row : matrix)
        {
            for (int num : row)
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}