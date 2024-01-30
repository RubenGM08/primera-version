package Unidad3;

/**
 * Tema 3
 * Actividad resuelta 3.9
 * Implementar una aplicación que pida al usuario un número comprendido entre 1 y 10. Hay
 * que mostrar la tabla de multiplicar de dicho número, asegurándose de que el número
 * introducido se encuentra en el rango establecido.
 */

import java.util.Scanner;

public class ActividadResuelta3_9 {
    public static void main(String[] args) {

//        //Declaramos el Escaner
//        Scanner sc = new Scanner(System.in);
//
//        //Inicializamos las variables
//        int numero, tablaMultiplicacion;
//
//
//
//        System.out.print("La tabla de multiplicacion del numero -> ");
//        //Pedimos al usuario un numero
//        numero= sc.nextInt();
//        System.out.println("");
//
//        for (int i=0; i<=10; i++){
//            // que se muestre la tabla de multiclicar de ese numero
//            tablaMultiplicacion= i * numero;
//
//            System.out.println(numero + " * " + i + " -> " + tablaMultiplicacion);
//
//        }


        //Ejercicio invetado pero es mio el del libro es el de arriba
        //Que me den todas las tablas de multiplicar y se multiplique
        //desde el 0 hasta el 10 y te aparezca el resultado. Ejemplo:
        // 5 * 2 -> 10

        int mutiplicacion;

        for (int i=0; i<=10; i++){
            for (int j=0; j<= 10; j++){
                mutiplicacion=i*j;
                System.out.println(i + " * " + j + " -> " + mutiplicacion);
            }
        }



    }
}
