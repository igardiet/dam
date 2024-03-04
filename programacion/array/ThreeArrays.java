package array;

import java.util.Scanner;

public class ThreeArrays
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter desired length of array1:");
        int array1Length = scanner.nextInt();
        int[] array1 = new int[array1Length];

        System.out.println("Enter desired length of array2:");
        int array2Length = scanner.nextInt();
        int[] array2 = new int[array2Length];

        for (int i = 0; i < array2.length; i++)
        {
            array2[i] = i + 1;
        }

        int[] array3 = new int[array1Length + array2Length];

        for (int i = 0; i < array1.length; i++)
        {
            array3[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++)
        {
            array3[array1.length + i] = array2[i];
        }

        System.out.println("Combined array:");
        for (int num : array3)
        {
            System.out.print(num + "");
        }

        scanner.close();
    }
}