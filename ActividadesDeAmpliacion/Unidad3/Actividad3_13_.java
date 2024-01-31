package Unidad3;

import java.util.Scanner;

/**
 * Actividades De Ampliacion
 * Tema 3
 * Actividad 1.13
 * Escribe un programa que incremente la hora de un reloj. Se pedirán por teclado la hora,
 * minutos y segundos, así como cuántos segundos se desea incrementar la hora introdu
 * cida. La aplicación mostrará la nueva hora. Por ejemplo, si las 13:59:51 se incrementan
 * en 10 segundos, resultan las 14:00:01.
 */


public class Actividad3_13_ {
    public static void main(String[] args) {

        //Declaramos el Escaner
        Scanner sc = new Scanner (System.in);

        //Inicializamos las variables
        int hora, minutos, segundos;

        //Pedimos que ponga las horas
        System.out.print("Dame las horas -> ");
        hora=sc.nextInt();
        //Pedimos que ponga las minutos
        System.out.print("Dame los minutos -> ");
        minutos=sc.nextInt();
        //Pedimos que ponga las segundos
        System.out.print("Dame los segundos -> ");
        segundos= sc.nextInt();

        System.out.println("La hora es -> " + hora + ":" + minutos + ":" + segundos);
        System.out.println(" ");

        System.out.print("Cuantos segundo quieres incrementarle -> ");
        int veces= sc.nextInt();

        for (int i = 1; i <= veces; i++){
            segundos++;
            if (segundos==60){
            segundos=0;
            minutos++;
            } if (minutos==60){
            minutos=0;
            hora++;
            } if (hora==24){
            hora=0;
            }
        }

        System.out.println("Ahora la hora segun los segundos ->" + veces);
        System.out.println("La hora más 10s es -> " + hora + ":" + minutos + ":" + segundos);
    }
}
