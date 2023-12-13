import java.util.Scanner;

public class EuroConverterEx
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el importe en euros: ");

        double importeEuros = scanner.nextDouble();

        System.out.println("Seleccione a que moneda desea convertir. L (libras) o E (Euros): ");

        char opcionMoneda = scanner.next().charAt(0);

        double resultado = 0.0;

        if (opcionMoneda == 'L' || opcionMoneda == 'l')
        {
            resultado = importeEuros * 0.85;
            System.out.println("El importe en libras es: " + resultado);
        } else if (opcionMoneda == 'E' || opcionMoneda == 'e')
        {
            resultado = importeEuros;
            System.out.println("El importe en euros es: " + resultado);
        } else
        {
            System.out.println("Opción no válida. Ingrese L o E");
        }
        scanner.close();
    }
}