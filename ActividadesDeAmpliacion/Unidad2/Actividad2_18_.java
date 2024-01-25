package Unidad2;

import java.util.Scanner;

/**
 * Actividades De Ampliacion
 * Tema 2
 * Actividad 1.18
 * Modifica la Actividad de aplicación 2.17 para que, además de los dos números aleatorios,
 * también aparezca la operación que debe realizar el jugador: suma, resta o multiplicación.
 *
 */

public class Actividad2_18_ {
    public static void main(String[] args) {

        //Declaramos el Escaner
        Scanner sc = new Scanner(System.in);

        //Inicializamos las variables
        int numeroAleatorio1, numeroAleatorio2, resultado = 0,operacion;

        numeroAleatorio1= (int) (Math.random()*100+1);
        numeroAleatorio2= (int) (Math.random()*100+1);

        System.out.println("El primer numero es= " + numeroAleatorio1);
        System.out.println("El segundo numero es= " + numeroAleatorio2);
        System.out.println("");

        System.out.println("*****************************");
        System.out.println("***** Día de la Semana  *****");
        System.out.println("** 1. Suma                **");
        System.out.println("** 2. Resta               **");
        System.out.println("** 3. Multiplicacion      **");
        System.out.println("****************************");
        System.out.println("");
        System.out.print("¿Cual operacion quieres realizar?-> ");
        operacion = sc.nextInt();

        switch (operacion){
            case 1:
                resultado= numeroAleatorio1+numeroAleatorio2;
                System.out.println("Has sumado= " + numeroAleatorio1 + "+" + numeroAleatorio2);
                break;
            case 2:
                resultado= numeroAleatorio1-numeroAleatorio2;
                System.out.println("Has restado= " + numeroAleatorio1 + " - " + numeroAleatorio2);
                break;
            case 3:
                resultado= numeroAleatorio1*numeroAleatorio2;
                System.out.println("Has multiplicado= " + numeroAleatorio1 + " * " + numeroAleatorio2);
                break;
        }

        System.out.println("El resultado de la operacion que quieres realizar es= " + resultado);






    }
}
