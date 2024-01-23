package Unidad2;

import java.util.Scanner;

/**
 * Diseñar una aplicación que solicite al usuario un número e indique si es par o impar.
 */

public class ActividadResuelta2_1 {
    public static void main(String[] args) {
        //Declaración del Scanner para socilitar los datos
        Scanner sc=new Scanner(System.in);
        int nun; //Asumo que solo se solicitan numero enteros
        System.out.print("Indique un número entero: " );
        nun= sc.nextInt();
        /* *****        Condicional *************/
        if (nun%2==0){
            System.out.println("En número " + nun + ", es par.");
        } else {
            System.out.println("El número " + nun + ", No es par.");
        }
    }
}
