package Unidad3;

/**
 * Tema 3
 * Actividad propuesta 3.2
 * Implementa la aplicación Eco, que pide al usuario un número y muestra en pantalla la salida:
 * Eco....
 * Eco....
 * Eco....
 * Se muestra «Eco...» tantas veces como indique el número introducido. La salida anterior
 * sería para el número 3.
 *
 */

import java.util.Scanner;

public class ActividadPropuesta3_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Indica Cúantas veces voy a mostrar el mensaje -> ");
        int veces= sc.nextInt();
        for (int i=1; i<=veces; i++){
            System.out.println("PUTOOOOOOOOOOOOOOOOOOOO");
        }


    }
}
