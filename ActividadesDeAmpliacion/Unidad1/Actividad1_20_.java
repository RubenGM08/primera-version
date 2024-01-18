package Unidad1;

import java.util.Scanner;

/**
 * Actividades De Ampliacion
 * Actividad 1.20
 * Solicita al usuario un número real y calcula su raíz cuadrada. Implementa el programa
 * utilizando el nombre cualificado de las clases, en lugar de utilizar ninguna importación.
 */

public class Actividad1_20_ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Pon un número real");
        int nReal = sc.nextInt();

        System.out.println(Math.sqrt(nReal));

    }
}
