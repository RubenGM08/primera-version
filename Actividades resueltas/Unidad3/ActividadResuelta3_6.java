package Unidad3;

/**
 * Tema 3
 * Actividad resuelta 3.6
 * Escribir una aplicación para aprender a contar, que pedirá un número n y mostrará todos
 * los números del 1 a n.
 */

import java.util.Scanner;

public class ActividadResuelta3_6 {
    public static void main(String[] args) {

        //Declaramos el Escaner
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un numero entero -> ");
        //Inicializamos las varibles y utilizamos el escaner con esa variable
        int numero= sc.nextInt();

        // utilizamos el for y mostrara los numeros desde el 1 hasta el numero que ponga el usuario
        for (int i=1; i<=numero; i++){
            System.out.println(i);
        }
    }
}
