package Unidad3;

/**
 * Tema 3
 * Actividad propuesta 3.3
 * Implementa un programa que pida al usuario un número positivo y lo muestre guarismo
 * a guarismo. Por ejemplo, para el número 123, debe mostrar primero el 3, a continuación
 * el 2 y por último el 1.
 */

import java.util.Scanner;

public class ActividadPropuesta3_3 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print("Indica el Número positivo y lo mostrare guarismo -> ");
        int numero = sc.nextInt(); //leemos el numero
        int numeroFor=numero; // aqui igualamos
        int unidad = 0;
        // para mostrarlo voy a calcular el unidad %10 y luego lo divido /10 hasta que el numero sea 0
        while (numero>0){
            unidad=numero%10;
            System.out.println(unidad);
            numero/=10;
        }

        System.out.println("****** Con Bucle FOR ******");
        // con bucle for
        for (int i=numeroFor; i>0; i/=10){
            System.out.println(i%10);
        }




    }
}
