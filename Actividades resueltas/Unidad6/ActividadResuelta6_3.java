package Unidad6;

import java.util.Scanner;

/**
 * Tema 6
 * Actividad resuelta 6.3
 * Diseñar el juego «Acierta la contraseña». La mecánica del juego es la siguiente: el primer
 * jugador introduce la contraseña; a continuación, el segundo jugador debe teclear palabras
 * hasta que la acierte. Realizar dos versiones; en la primera se facilita el juego indicando
 * si la palabra introducida es mayor o menor alfabéticamente que la contraseña. En la se-
 * gunda, el programa mostrará la longitud de la contraseña y una cadena con los caracteres
 * acertados en sus lugares respectivos y asteriscos en los no acertados.
 *
 */

public class ActividadResuelta6_3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String password, palabra;
        mostrar("Jugador 1. Introduce la contraseña: ");
        password= sc.next();sc.nextLine(); //leemos la contraseña
        do {
            mostrar("Jugador 2. Palabra: ");
            palabra= sc.next();sc.nextLine();
            int comparacion= password.compareTo(palabra); //comparamos alfabéticamente
            if (comparacion==0){
                mostrar("¡Acertastes!");//son iguales
            } else if (comparacion < 0) {
                mostrar("La contraseña es menor que: " + palabra);
            } else {
                mostrar("La contraseña es mayor que: " + palabra);
            }
        } while (!password.equals(palabra));

    }

    public static void mostrar(String texto) { System.out.println("\t" + texto); }
    public static void mostrarSinLn(String texto) { System.out.print("\t" + texto); }

}
