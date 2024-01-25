package Unidad2;

/**
 * Actividades De Ampliacion
 * Tema 2
 * Actividad 1.17
 * Realiza el «juego de la suma», que consiste en que aparezcan dos números aleatorios
 * (comprendidos entre 1 y 99) que el usuario tiene que sumar. La aplicación debe indicar si
 * el resultado de la operación es correcto o incorrecto.
 */


import java.util.Scanner;

public class Actividad2_17_ {
    public static void main(String[] args) {

        //Declaramos el Escaner
        Scanner sc = new Scanner(System.in);

        //Inicializamos las variables
        int numeroAleatorio1, numeroAleatorio2, suma, resultado;

        numeroAleatorio1= (int) (Math.random()*100+1);
        numeroAleatorio2= (int) (Math.random()*100+1);

        suma=numeroAleatorio1+numeroAleatorio2;

        System.out.println("El primer numero es= " + numeroAleatorio1);
        System.out.println("El segundo numero es= " + numeroAleatorio2);
        System.out.println("");

        System.out.println("¿Cual es el resultado de sumar estos dos numeros?= ");
        resultado= sc.nextInt();

        if (suma==resultado){
            System.out.println("El numero es igual, es correcto");
        } else {
            System.out.println("El numero no es igual, has fallado");
        }
    }
}
