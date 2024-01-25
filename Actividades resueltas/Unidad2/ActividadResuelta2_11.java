package Unidad2;

/**
 * Tema 2
 * Actividades resueltas 2.11
 * Idear un programa que solicite al usuario un número comprendido entre 1 y 7, correspondiente
 * un día de la semana. Se debe mostrar el nombre del día de la semana al que
 * corresponde. Por ejemplo, el número 1 corresponde a «lunes» y el 6 a «sábado».
 */

import java.util.Scanner;

public class ActividadResuelta2_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int diaSemana;

        System.out.println("*****************************");
        System.out.println("***** Día de la Semana  *****");
        System.out.println("** 1. Lunes                **");
        System.out.println("** 2. Martes               **");
        System.out.println("** 3. Miercoles            **");
        System.out.println("** 4. Jueves               **");
        System.out.println("** 5. Viernes              **");
        System.out.println("** 6. Sabado               **");
        System.out.println("** 7. Domingo              **");
        System.out.println("*****************************");
        System.out.println("");
        System.out.print(" Indica tu opcion->");
        diaSemana = sc.nextInt();

        switch (diaSemana){
            case 1: {
                System.out.println("Lunes");
                break;
            }
            case 2: {
                System.out.println("Martes");
                break;
            }
            case 3: {
                System.out.println("Miercos");
                break;
            }
            case 4: {
                System.out.println("Jueves");
                break;
            }
            case 5: {
                System.out.println("Vienes");
                break;
            }
            case 6: {
                System.out.println("Sabado");
                break;
            }
            case 7: {
                System.out.println("Domingo");
                break;
            }
            default:{
                System.out.println("La selección del día solo es del 1 al 7");
                break;
            }

        }

    }
}
