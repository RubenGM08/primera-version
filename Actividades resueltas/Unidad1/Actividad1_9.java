package unidad1;

import java.util.Scanner;

/**
 *Actividad1_9
 *Escribir un programa que pida un número al usuario e indique mediante un
 *literal boolea-no (true o false) si el número es par.
 */

public class Actividad1_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un número: ");
        int numero= sc.nextInt();
        boolean esPar = (numero/2) == 0;
        System.out.println("Es par: " + esPar);

    }
}
