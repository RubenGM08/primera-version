package Unidad3;

import java.util.Scanner;

/**
 * Tema 3
 * Actividad resuelta 3.11
 * Pedir un número y calcular su factorial. Por ejemplo, el factorial de 5 se denota 5! y es
 * igual a 5 × 4 × 3 × 2 × 1 = 120.
 *
 */

public class ActividadResuelta3_11 {
    public static void main(String[] args) {

        //Declaramos el Escaner
        Scanner sc = new Scanner(System.in);

        //Inicializamos las variables
        int numero, factorial=1;

        System.out.println("Pon un numero entero y vamos a sacar el factorial de ese numero -> ");
        numero= sc.nextInt();

        for (int i=numero; i>0; i--){
            factorial= factorial * i;

            System.out.print(i + " * " );
           System.out.println(factorial);
        }

    }
}
