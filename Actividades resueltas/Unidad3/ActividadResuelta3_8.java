package Unidad3;

/**
 * Tema 3
 * Actividad resuelta 3.8
 * Pedir diez números enteros por teclado y mostrar la media.
 *
 */


import java.util.Scanner;

public class ActividadResuelta3_8 {
    public static void main(String[] args) {

        //Declaramos el Escaner
        Scanner sc = new Scanner(System.in);

        //Inicaializamos las variables
        int numero;
        int suma = 0;
        double media;

        for (int i = 1; i <= 10; i++){
            System.out.print("Escribe un número entero: ");
            numero= sc.nextInt();
            suma += numero;
        }

        media = suma / 10.0;
        System.out.println("La media de los numeros es -> " + media);




    }
}
