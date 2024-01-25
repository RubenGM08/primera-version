package Unidad2;

import java.util.Scanner;

/**
 * Tema 2
 * Actividades resueltas 2.8
 * Pedir los coeficientes de una ecuación de segundo grado y mostrar sus soluciones reales
 * Si no existen, habrá que indicarlo. Hay que tener en cuenta que las soluciones de una
 * ecuación de segundo grado, ax2 + bx + c = 0, son:
 *
 */

public class ActividadResuelta2_8 {
    public static void main(String[] args) {
        //Declaramos el escaner
        Scanner sc = new Scanner(System.in);

        //Inicializamos la variables enteras
        int a, b, c, dentroRaizCuadrada;
        double x, parteArriba, parteAbajo;

        System.out.print("Inicializamos la variable a= ");
        a= sc.nextInt();

        System.out.print("Inicializamos la variable b= ");
        b= sc.nextInt();

        System.out.print("Inicializamos la variable c= ");
        c= sc.nextInt();

        dentroRaizCuadrada=(b*b)-4*a*c;

//        System.out.println(Math.sqrt(dentroRaizCuadrada));

        if (dentroRaizCuadrada > 0){
            //Tiene dos resultados
            double primeraSolucion= ((-b+(Math.sqrt(dentroRaizCuadrada)))/2*a);
            double segundaSolucion= ((-b-(Math.sqrt(dentroRaizCuadrada)))/2*a);

            System.out.println("El primer resultado es= " + primeraSolucion);
            System.out.println("El segundo resultado es= " + segundaSolucion);

        } else if (dentroRaizCuadrada == 0) {
            //Tiene un resultado
            double solucion = (-b) / (2 * a);

            System.out.println("La única solución es: " + solucion);

        } else if (dentroRaizCuadrada < 0) {
            //No tiene resultado
            System.out.println("No tiene resultado ;(");
        }


    }
}