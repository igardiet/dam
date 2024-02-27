package array;

public class ArrayIndex
{
    public static void main(String[] args)
    {
        int[] array1 = new int[5]; // Declaración con tamaño fijo

        int[] array2 = { 1, 2, 3, 4, 5 }; // Init directa con valores

        int[] array3;
        array3 = new int[] { 1, 2, 3, 4, 5 }; // Declaración e init separadas

        int array4[] = new int[5]; // Declaración con tamaño implícito

        int array5[] = { 1, 2, 3, 4, 5 }; // Declaración con tamaño y valores implícitos

        // -------------------------------------------------------------------

        // Inicialización con valores conocidos: Si conoces los valores que
        // deseas almacenar en el array desde el principio, la inicialización
        // directa con valores es conveniente y fácil de entender.
        int[] array6 = { 1, 2, 3, 4, 5 };
        
        // Declaración e inicialización separadas: Si necesitas declarar el
        // array primero y luego inicializarlo más tarde en el código, esta
        // forma es útil.
        int[] array7;
        array7 = new int[] { 1, 2, 3, 4, 5 };
        
        // Declaración con tamaño fijo: Si necesitas un array de un tamaño
        // específico pero no conoces los valores exactos en el momento de la
        // declaración, esta forma es apropiada.
        int[] array8 = new int[5];
    }
}