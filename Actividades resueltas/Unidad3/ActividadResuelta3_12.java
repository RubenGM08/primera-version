package Unidad3;

/**
 * Tema 3
 * Actividad resuelta 3.12
 * Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
 *
 */

import java.util.Scanner;

public class ActividadResuelta3_12 {
    public static void main(String[] args) {

        //Declaramos el Escaner
        Scanner sc = new Scanner(System.in);

        //Inicializamos las variables
        int nota;

        for (int i=1; i<=5; i++){
            System.out.println("Dame cinco notas del 0 al 10 de los alumnos->");
            nota = sc.nextInt();

            if (nota<5){
                System.out.println("Estas suspenso");
            } else {
                System.out.println("Estas aprobado");
            }


        }






    }
}
