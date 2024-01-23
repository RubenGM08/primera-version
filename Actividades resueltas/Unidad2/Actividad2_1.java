package Unidad2;

import java.util.Scanner;

/**
 *  Diseñar una aplicación al usuario un número e indique si es
 *  par o impar
 *
 *  Análisis: Para ser par, tenemos que calcular el modulo (%) al numero leido
 *  y si cumple que el resultado ==0 es par sino es impar.
 */

public class Actividad2_1 {
    //Insertamos el metodo principal
    public static void main(String[] args) {
        //Declaración del Scanner para socilitar los datos
        Scanner sc = new Scanner(System.in);
        int nun; //Asumo que solo se solicitan numero enteros
        System.out.print("Indique un número entero: " );
        nun= sc.nextInt();
        /* *****        Condicional *************/
        if (nun%2==0){
            System.out.println("En número " + nun + ", es par.");
        } else {
            System.out.println("El número " + nun + ", No es par.");
        }

        String nombre;
        System.out.print("Indica tu nombre -> ");
        nombre= sc.next();

        // para comparar cadenas de caracteres en java utilizamos un metodo llama equals
        if (nombre.equals("Maria")){ // Medtodo de String
            System.out.println("Es el nombre que esperaba");
        } else {
            System.out.println("Tu nombre no es el indicado");
        }
    }
}
