package array;

import java.util.Scanner;

public class GraphicArray
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of cells: ");
        int cells = scanner.nextInt();
        int[] table = new int[cells];

        for (int i = 0; i < table.length; i++)
        {
            table[i] = i + 1;
            System.out.print(table[i] + " ");
        }

        System.out.println();

        int i = 0;
        while (i < table.length)
        {
            System.out.print(table[i] + " ");
            i++;
        }

        System.out.println();

        System.out.println("Print table visually:");
        for (int n = 0; n < table.length; n++)
        {
            System.out.print("| " + table[n] + " ");
        }
        System.out.println("|");

        scanner.close();
    }
}