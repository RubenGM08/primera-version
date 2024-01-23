package Unidad2;

import java.util.Scanner;

/**
 * Tema 2
 * Actividad 2_2
 * Solicita por teclado un número de tipo int al usuario y escribe un programa que muestre
 * true o false, dependiendo de si el número es positivo.
 *
 */

public class Actividad2_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Escribe un numero= ");
        numero= sc.nextInt();

        if (numero>=0){
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }
    }
}
