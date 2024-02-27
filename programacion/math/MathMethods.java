public class MathMethods
{
    public static void main(String[] args)
    {
        int x;
        double rand, y, z;
        float max;

        rand = Math.random();
        x = Math.abs(-123);
        y = Math.round(123.567);
        z = Math.pow(2, 4);
        max = Math.max((float) 1e10, (float) 3e9);

        System.out.println(rand);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(max);
    }
}

// ENUNCIADO:
// Desarrolla un programa en Java que utilice diferentes métodos de la clase
// Math para realizar operaciones matemáticas y mostrar los resultados. El
// programa generará un número aleatorio, calculará el valor absoluto de un
// número entero, redondeará un número decimal, calculará una potencia y
// determinará el máximo entre dos números en punto flotante.
// El programa mostrará los resultados de estas operaciones en la consola.

// FLUJO DEL CÓDIGO:
// Se declara la función main como punto de entrada del programa.
// Se declaran las variables x, rand, y, z y max.
// Se genera un número aleatorio y se asigna a la variable rand utilizando el
// método Math.random().
// Se calcula el valor absoluto de -123 y se asigna a la variable x utilizando
// el método Math.abs().
// Se redondea el número 123.567 y se asigna a la variable y utilizando el
// método Math.round().
// Se calcula la potencia de 2 elevado a la 4 y se asigna a la variable z
// utilizando el método Math.pow().
// Se determina el máximo entre 1e10 y 3e9 y se asigna a la variable max
// utilizando el método Math.max().
// Se imprimen en la consola los valores de las variables rand, x, y, z y max
// utilizando System.out.println().
// El programa finaliza.