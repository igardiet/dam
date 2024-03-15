package matrix;

import java.util.Scanner;

public class MatrixSumValues
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the matrices (n):");
        int n = scanner.nextInt();

        int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];
        int[][] resultMatrix = new int[n][n];

        System.out.println("Enter the elements of the first matrix:");
        fillMatrix(scanner, matrix1);

        System.out.println("Enter the elements of the second matrix:");
        fillMatrix(scanner, matrix2);

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("First matrix:");
        printMatrix(matrix1);

        System.out.println("Second matrix:");
        printMatrix(matrix2);

        System.out.println("Result matrix:");
        printMatrix(resultMatrix);

        scanner.close();
    }

    private static void fillMatrix(Scanner scanner, int[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    private static void printMatrix(int[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}