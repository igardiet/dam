// Escribir todos los números del 100 al 0 de 7 en 7.

package loop;

public class NumsBySeven
{
    public static void main(String[] args)
    {
        for (int i = 100; i >= 0; i -= 7)
        {
            System.out.println(i);
        }
    }
}