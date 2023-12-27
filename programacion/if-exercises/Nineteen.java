// Necesitamos mostrar un contador con 5 dígitos (X-X-X-X-X), que muestre los
// números del 0-0-0-0-0 al 9-9-9-9-9, con la particularidad que cada vez que
// aparezca un 3 lo sustituya por una E.

public class Nineteen
{
    public static void main(String[] args)
    {
        for (int i = 0; i <= 99999; i++)
        {
            // format number with five digits
            String number = String.format("%05d", i);

            // replace one char for a desired new one
            number = number.replace('3', 'E');

            System.out.println(number);
        }
    }
}