package Unidad2;

/**
 * Tema 2
 * Actividades resueltas 2.13
 * Escribir un programa que pida una hora de la siguiente forma: hora, minutos y segundos.
 * El programa debe mostrar qué hora será un segundo más tarde. Por ejemplo:
 *
 *          hora actual [10:41:59] --> hora actual +1 segundo: [10:42:00]
 *
 */

import java.util.Scanner;

public class ActividadResuelta2_13 {
    public static void main(String[] args) {

        // Declaramos el Escaner
        Scanner sc = new Scanner(System.in);

        //Inicializamos con tres variables de tipo int
        int horas, minutos, segundos;

        //Pedimos las horas
        System.out.print("Pon el numero de Horas= ");
        horas= sc.nextInt();
        System.out.println("");

        //Pedimos los minutos
        System.out.print("Pon el numero de Minutos= ");
        minutos= sc.nextInt();
        System.out.println("");

        //Pedimos los segundos
        System.out.print("Pon el numero de Segundos= ");
        segundos= sc.nextInt();
        System.out.println("");

        //Decimos la hora que es
        System.out.println("La horas es= " + horas+":"+ minutos +":"+ segundos);
        System.out.println("");

        //Incrementamos los segundos
        segundos++;
        if (segundos==60){ //si los segundos superan los 59
            segundos=0; //reiniciamos los segundos
            minutos++; //Aumentamos los minutos
            if (minutos==60){ //si los minutos superan los 59
                minutos=0; //reiniciamos los minutos
                horas++; // aumentamos las horas
                if (horas==24){ //si las horas superan los 23
                    horas=0; //reiniciamos las horas
                }
            }
        }

        //Decimos la nueva hora si le sumamos +1 segundo
        System.out.println("La hora si le aumentamos 1 segundo seria= " + horas + ":" + minutos + ":" + segundos);


    }
}
