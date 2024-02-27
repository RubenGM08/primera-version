package Unidad4;

import java.util.Scanner;

/**
 * Tema 4
 * Actividad resuelta 4.7
 * Escribir una fuancion a la que se le pase un número entreo y devuelva el número de
 * divisiones primos que tiene
 */

public class ActividadResuelta4_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escibe un numero entero -> ");
        int numero= sc.nextInt();

        System.out.print("El numero " + numero + " tiene un total de " + numeroDeDivisionesQueTiene(numero)  + " divisiones" );
    }

    public static int numeroDeDivisionesQueTiene(int num) {
        int contador= 0;
        for (int i = 2; i < num; i++) {
            if (num % i==0){
                contador++;
            }
        }
        return contador;


    }
}
