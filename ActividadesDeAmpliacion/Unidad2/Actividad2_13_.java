package Unidad2;

/**
 * Actividades De Ampliacion
 * Tema 2
 * Actividad 1.13
 * En una granja se compra diariamente una cantidad (comidaDiaria) de comida para los animales
 * El número de animales que alimentar (todos de la misma especie) es numAnimales,
 * y sabemos que cada animal come una media de kilosPorAnimal.
 * Diseña un programa que solicite al usuario los valores anteriores y determine si disponemos
 * mos de alimento suficiente para cada animal. En caso negativo, ha de calcular cuál es la
 * ración que corresponde a cada uno de los animales.
 * Nota: Evitar que la aplicación realice divisiones por cero.
 *
 */

import java.util.Scanner;

public class Actividad2_13_ {
    public static void main(String[] args) {

        /* Granja y cálculo de raciones */
        Scanner sc = new Scanner(System.in);

        //Variables
        int numeroAnimales;
        double cantidadComida, kiloXanimal, racion;

        System.out.println("Indica el número de animales en la Granja");
        numeroAnimales= sc.nextInt();
        System.out.println("");

        System.out.println("Indica la cantidad de comida disponible");
        cantidadComida= sc.nextInt();
        System.out.println("");

        System.out.println("Indica cuanta comida come cada animal");
        kiloXanimal= sc.nextInt();
        System.out.println("");

        /* Analizamos los datos, si la cantidadComida > numeroAnimales * kiloXanimal , entonces
        *  tendria suficiente comida
        *  */

        if (cantidadComida>=numeroAnimales*kiloXanimal){
            System.out.println("Hay sufienete comida");
        } else {
            System.out.println("Falta comida en la Granja, hay que ajustar la racion");
            // si esta condicion se cumple, solicitan que calcule la ración necesaria
            // y evitamos la division entre 0
            if (numeroAnimales!=0){
                racion=cantidadComida/numeroAnimales;
                System.out.println("Ajustando a lo que hay, los animales comeran " + racion + " kg " +
                        "y no tendran los kilos iniciales ("+ kiloXanimal+"kg)");
            }


        }

    }
}
