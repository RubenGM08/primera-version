package Unidad2;

import java.util.Scanner;

/**
 * Escribe una aplicación que pida al usuario dos números enteros y muestre: true, si
 * ambos números son distintos entre sí o alguno de ellos es cero; y false en caso contrario.
 *
 * A!= B || A==0 || B==0
 */

public class Actividad2_3 {
    public static void main(String[] args) {
        // Declaramos escaner
        Scanner sc = new Scanner(System.in);

        // Declaramos las variables que vamos a leer
        int numero1, numero2;

        //Socilitamos los datos al usuario
        System.out.println("Indique el valor del primer numero= " );
        numero1= sc.nextInt();

        System.out.println("Indique el valor del primer numero= " );
        numero2= sc.nextInt();

        if (numero1!=numero2 || numero1==0 || numero2==0){
            System.out.println("Se ha cumplido la condición");
        } else {
            System.out.println("Esto no cumple la condición");
        }


    }
}
