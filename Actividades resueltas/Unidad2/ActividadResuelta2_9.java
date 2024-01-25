package Unidad2;

import java.util.Scanner;

/**
 * Tema 2
 * Actividades resueltas 2.9
 * Escribir una aplicación que indique cuántas cifras tiene un número entero introducido por
 * teclado, que estará comprendido entre 0 y 99 999.
 *
 */

public class ActividadResuelta2_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Escribe un numero entero y mira cuantas cifras tiene.");
        System.out.println("Escribe el numero que quieras entre el 0 y el 99999= ");
        numero= sc.nextInt();


        if (numero<=9){
            System.out.println("Tiene una cifra");
        } else if (numero<=99) {
            System.out.println("Tiene dos cifras");
        } else if (numero<=999) {
            System.out.println("Tiene tres cifras");
        } else if (numero<=9999) {
            System.out.println("Tiene cuatro cifras");
        } else if (numero<=99999) {
            System.out.println("Tiene cinco cifras");
        }


    }
}
