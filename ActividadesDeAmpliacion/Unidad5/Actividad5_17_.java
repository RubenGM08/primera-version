package Unidad5;

import java.util.Scanner;

/**
 * Actividades De Ampliacion
 * Tema 5
 * Actividad 5.17
 * Implementa la función: int[] suma(int t[], int numElementos), que crea y devueve
 * una tabla con las sumas de los numElementos elementos consecutivos de t. Veamos
 * un ejemplo, sea t = [10, 1, 5, 8, 9, 2]. Si los elementos de t se agrupan de 3 en 3, se
 * harán las sumas:
 *  10 + 1 + 5. Igual a 16.
 *  1 + 5 + 8. Igual a 14.
 *  5 + 8 + 9. Igual a 22.
 *  8 + 9 + 2. Igual a 19.
 * Por lo tanto, la función devolverá una tabla con los resultados: [16, 14, 22, 19].
 *
 */

public class Actividad5_17_ {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

    }



    /**
     * Metodo para mostrar en consola los texto con salto de línea
     * @param texto
     */

    public static void mostrar(String texto) { System.out.println("\t" + texto); }


    /**
     * Metodo para mostrar en consola los texto con salto de línea
     * @param texto
     */

    public static void mostrarSinLn(String texto) { System.out.print("\t" + texto); }


}
