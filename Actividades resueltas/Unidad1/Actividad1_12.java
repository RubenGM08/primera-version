package Unidad1;

/**
 * Actividad 12
 * Escribir un programa que pida un número al usuario y muestre su valor absoluto.
 */

import java.util.Scanner;

public class Actividad1_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pon un numero entero que se positivo o negativo");
        int numero = sc.nextInt();
        int valorAbsoluto = numero < 0 ? -1 * numero : numero;
        System.out.println("El valor absoluto de " + numero + " es " + valorAbsoluto);        System.out.println("");

    }
}
