package array;

public class ArrayIndex
{
    public static void main(String[] args)
    {
        // Declaración con tamaño fijo
        int[] array1 = new int[5];

        // Init directa con valores
        int[] array2 = { 1, 2, 3, 4, 5 };

        // Declaración e init separadas
        int[] array3;
        array3 = new int[] { 1, 2, 3, 4, 5 };

        // Declaración con tamaño implícito
        int array4[] = new int[5];

        // Declaración con tamaño y valores implícitos
        int array5[] = { 1, 2, 3, 4, 5 };

        System.out.println(array1);
        System.out.println(array2);
        System.out.println(array3);
        System.out.println(array4);
        System.out.println(array5);
    }
}