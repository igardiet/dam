// POSIBLE ENUNCIADO:
// Escribe un programa en Java que simule un juego de lanzamiento de dados entre dos jugadores.
// El programa debe generar aleatoriamente los resultados de los lanzamientos para cada jugador y determinar quién obtuvo el resultado más alto.
// Luego, debe imprimir el resultado de cada lanzamiento y anunciar al ganador del juego.

public class Dice
{
    public static void main(String args[])
    {
        System.out.println("Se presentan los participantes. A continuación, hará su lanzamiento el jugador 1");
        double aux1 = (Math.random() * 6) + 0.5;
        double aux2 = (Math.random() * 6) + 0.5;
        double intento1 = Math.round(aux1);
        double intento2 = Math.round(aux2);
        int jugador1 = (int) intento1;
        int jugador2 = (int) intento2;
        System.out.println("El jugador 1 ha sacado:" + jugador1 + " y el jugador 2: " + jugador2);
        int ganador = Math.max(jugador1, jugador2);
        System.out.println("Quién sacó " + ganador + " es el ganador");
    }
}

// EXPLICACIÓN:
// El código simula un juego en el que dos jugadores lanzan un dado (con valores
// del 1 al 6) y se determina quién obtiene el mayor resultado.
// La línea System.out.println("Se presentan los participantes. A continuación,
// hará su lanzamiento el jugador 1");
// imprime un mensaje para indicar que se presentarán los participantes y que el
// jugador 1 hará su lanzamiento.
// Las siguientes dos líneas generan números aleatorios entre 0.5 y 6.5
// utilizando Math.random() * 6 y luego los redondean utilizando Math.round()
// para obtener valores enteros entre 1 y 6. Estos valores representan los
// resultados de los lanzamientos de los dados para el jugador 1 y el jugador 2.
// Se convierten los valores redondeados en enteros utilizando un casting
// explícito (int) y se asignan a las variables jugador1 y jugador2.
// Se imprime el resultado de los lanzamientos de ambos jugadores utilizando la
// concatenación de cadenas y los valores de las variables jugador1 y jugador2.
// Se utiliza Math.max(jugador1, jugador2) para determinar cuál de los dos
// jugadores obtuvo el resultado más alto. El valor máximo se asigna a la
// variable ganador.
// Finalmente, se imprime el mensaje indicando quién es el ganador, utilizando
// el valor de la variable ganador.