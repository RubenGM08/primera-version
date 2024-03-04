package Unidad5;

import java.util.Scanner;

/**
 * Tema 5
 * Actividad resuelta 5.3
 * Escribir una aplicacion que solicite al usuario cuántos números desea introducir.
 * A continuación, introducir por teclado esa cantidad de números enteros, y por ultimo, mostrar en
 * el orden inverso al introducido.
 */

public class ActividadResuelta5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mostrar("Indique el número de elementos enteros a insertar->");
        int longitud= sc.nextInt();
        int numeros[]= new int[longitud];
        for (int i = 0; i < longitud; i++) {
            mostrar("Indique el numero-> ");
            numeros[i]= sc.nextInt();
        }
        //Vamos a mostrar de forma inversa
        mostrar("Muestra de forma inversa los numeros insertados");
        mostrar("-----------------------------------------------");
        for (int i = numeros.length-1; i >=0 ; i--) {
            mostrar("-> " + numeros[i] );
        }

    }

    public static void mostrar(String texto) {
        System.out.println("\t"+texto);
    }
}
