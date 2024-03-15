package matrix;

import java.util.Scanner;

public class Matrix4x4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[4][4];
        boolean matrixFilled = false;

        while (true)
        {
            System.out.println("Menu:");
            System.out.println("1. Fill the matrix");
            System.out.println("2. Sum of a row");
            System.out.println("3. Sum of a column");
            System.out.println("4. Sum of main diagonal");
            System.out.println("5. Sum of reverse diagonal");
            System.out.println("6. Average of all values");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();

            switch (choice)
            {
            case 1:
                fillMatrix(scanner, matrix);
                matrixFilled = true;
                break;
            case 2:
                if (matrixFilled)
                {
                    System.out.println("Enter the row number to sum (0-3):");
                    int row = scanner.nextInt();
                    if (isValidIndex(row))
                    {
                        int sum = sumRow(matrix, row);
                        System.out.println("Sum of row " + row + ": " + sum);
                    } else
                    {
                        System.out.println("Invalid row number. Please enter a number between 0 and 3.");
                    }
                } else
                {
                    System.out.println("Please fill the matrix first.");
                }
                break;
            case 3:
                if (matrixFilled)
                {
                    System.out.println("Enter the column number to sum (0-3):");
                    int col = scanner.nextInt();
                    if (isValidIndex(col))
                    {
                        int sum = sumColumn(matrix, col);
                        System.out.println("Sum of column " + col + ": " + sum);
                    } else
                    {
                        System.out.println("Invalid column number. Please enter a number between 0 and 3.");
                    }
                } else
                {
                    System.out.println("Please fill the matrix first.");
                }
                break;
            case 4:
                if (matrixFilled)
                {
                    int sum = sumMainDiagonal(matrix);
                    System.out.println("Sum of main diagonal: " + sum);
                } else
                {
                    System.out.println("Please fill the matrix first.");
                }
                break;
            case 5:
                if (matrixFilled)
                {
                    int sum = sumReverseDiagonal(matrix);
                    System.out.println("Sum of reverse diagonal: " + sum);
                } else
                {
                    System.out.println("Please fill the matrix first.");
                }
                break;
            case 6:
                if (matrixFilled)
                {
                    double average = calculateAverage(matrix);
                    System.out.println("Average of all values: " + average);
                } else
                {
                    System.out.println("Please fill the matrix first.");
                }
                break;
            case 7:
                System.out.println("Exiting program. Goodbye!");
                scanner.close();
                return;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        }
    }

    private static void fillMatrix(Scanner scanner, int[][] matrix)
    {
        System.out.println("Enter values for the matrix (4x4):");
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    private static boolean isValidIndex(int index)
    {
        return index >= 0 && index < 4;
    }

    private static int sumRow(int[][] matrix, int row)
    {
        int sum = 0;
        for (int i = 0; i < matrix[row].length; i++)
        {
            sum += matrix[row][i];
        }
        return sum;
    }

    private static int sumColumn(int[][] matrix, int col)
    {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++)
        {
            sum += matrix[i][col];
        }
        return sum;
    }

    private static int sumMainDiagonal(int[][] matrix)
    {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++)
        {
            sum += matrix[i][i];
        }
        return sum;
    }

    private static int sumReverseDiagonal(int[][] matrix)
    {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++)
        {
            sum += matrix[i][matrix.length - 1 - i];
        }
        return sum;
    }

    private static double calculateAverage(int[][] matrix)
    {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                sum += matrix[i][j];
                count++;
            }
        }
        return (double) sum / count;
    }
}