package Unidad4;

import java.util.Scanner;

/**
 * Tema 4
 * Actividad resuelta 4.6
 * Diseñar una fúncion con el siguiente prototipo:
 *      boolean es Primo(int n)
 * que devolverá true si n es primo y false en caso contrario
 */

public class ActividadResuelta4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a escribir un numero entero y vamos a mirar si es primo o no");
        System.out.print("Escribe el numero -> ");
        int numero= sc.nextInt();


        System.out.print("\nEl numero " + numero + " es -> " );
        boolean resultado= esPrimo(numero);
    }


    public static boolean esPrimo(int num) {
        boolean primo = true;
        for(int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }
        if (primo)
            System.out.println("Es Primo");
        else
            System.out.println("No es primo");
        return primo;



    }


}
