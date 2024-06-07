import java.util.ArrayList;
import java.util.Scanner;

public class NumberListManager
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numberList = new ArrayList<>();
        int[] numberArray = new int[10];

        boolean running = true;

        while (running)
        {
            System.out.println("-- Number List Manager --");
            System.out.println("1. Agregar número");
            System.out.println("2. Calcular suma");
            System.out.println("3. Encontrar el número más grande");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            int choice = scanner.nextInt();

            switch (choice)
            {
            case 1:
                System.out.println("Enter a number:");
                int number = scanner.nextInt();
                numberList.add(number);
                addNumberToArray(numberArray, number);
                break;
            case 2:
                int sumList = sumNumbers(numberList);
                int sumArray = sumNumbers(numberArray);
                System.out.println("Numbers sum in ArrayList: " + sumList);
                System.out.println("Numbers sum in Array: " + sumArray);
                break;
            case 3:
                int maxList = findMaxNumber(numberList);
                int maxArray = findMaxNumber(numberArray);
                System.out.println("Highest number in ArrayList: " + maxList);
                System.out.println("Highest number in Array: " + maxArray);
                break;
            case 4:
                running = false;
                break;
            default:
                System.out.println("Invalid option, try again!");
                break;
            }
        }

        scanner.close();
    }

    private static void addNumberToArray(int[] array, int number)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == 0)
            {
                array[i] = number;
                break;
            }
        }
    }

    private static int sumNumbers(ArrayList<Integer> list)
    {
        int sum = 0;
        for (int num : list)
        {
            sum += num;
        }
        return sum;
    }

    private static int sumNumbers(int[] array)
    {
        int sum = 0;
        for (int num : array)
        {
            sum += num;
        }
        return sum;
    }

    private static int findMaxNumber(ArrayList<Integer> list)
    {
        if (list.isEmpty())
        {
            return Integer.MIN_VALUE;
        }

        int max = list.get(0);

        for (int num : list)
        {
            if (num > max)
            {
                max = num;
            }
        }
        return max;
    }

    private static int findMaxNumber(int[] array)
    {
        int max = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > max)
            {
                max = array[i];
            }
        }
        return max;
    }
}