package Unidad2;

import java.util.Scanner;

/**
 * Tema 2
 * Actividad resuelta 2_2
 * Pedir dos números enteros y decir si son iguales o no.
 */

public class ActividadResuelta2_2 {
    public static void main(String[] args) {
        //Declaramos el escaner
        Scanner sc=new Scanner(System.in);
        //Iniciamos las variables enteras
        int numero1, numero2;

        //Pedimos que ponga dos numeros enteros
        System.out.println("Escribe dos numeros enteros");
        //El primer numero entero
        System.out.print("El primer numero= ");
        numero1= sc.nextInt();
        //El segundo numero entero
        System.out.print("El segundo numero= ");
        numero2= sc.nextInt();

        //Utilizamos en condicional if-else para mira si es igual o si no es igual
        if (numero1==numero2) {
            System.out.println("Los numero son iguales");
        } else {
            System.out.println("Los numero no son iguales");
        }





    }
}
