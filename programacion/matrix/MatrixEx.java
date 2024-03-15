package matrix;

public class MatrixEx
{
    public static void main(String[] args)
    {
        String[][] matrix = new String[3][3];

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix.length; j++)
            {
                matrix[i][j] = "Row: " + i + " Column: " + j;
                System.out.println(matrix[i][j]);
            }
            System.out.println("--- " + "End of row: " + i + " ---");
        }
    }
}