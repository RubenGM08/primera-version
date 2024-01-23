package Unidad2;

import java.util.Scanner;

/**
 * Tema 2
 * Actividad propuesta 2.4
 * Realiza un programa que informe al usuario (mostrando true) si un primer número es
 * multiplo de otro número. Ambos números se piden por teclado.
 */

public class Actividad2_4 {
    public static void main(String[] args) {

        // Declaramos las variables
        int numero1;
        int numero2;

        // Pedimos los números por teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        numero1 = sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        numero2 = sc.nextInt();

        // Comprobamos si el primer número es múltiplo del segundo
        if (numero1 % numero2 == 0) {
            System.out.println("El primer número es múltiplo del segundo: true");
        } else {
            System.out.println("El primer número no es múltiplo del segundo: false");
        }
    }
}
