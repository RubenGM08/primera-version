package Unidad2;

/**
 * Tema 2
 * Actividades Propuesta 2.5
 * Escribir un programa que calcule el dinero recaudado en un concierto. La aplicación
 * solicitará el aforo máximo del local, el precio por entrada (suponemos que todas las
 * entradas tienen el mismo precio) y el número de entradas vendidas. Hay que tener
 * en cuenta que si el número de entradas vendidas no supera el 20 % del aforo del local,
 * se cancela el concierto. Si el número de entradas vendidas no supera el 50 %
 * del aforo del local, se realiza una rebaja del 25 % del precio de la entrada.
 *
 */

import java.util.Scanner;



public class ActividadPropuesta2_5 {
    public static void main(String[] args) {

        // Declaramos el Escaner
        Scanner sc = new Scanner(System.in);
        int aforo, numeroVendidas;
        double precioEntrada, recaudacion;

        //Pedimos el precio de la entrada
        System.out.print("Indique el precio de las Entradas= ");
        precioEntrada= sc.nextDouble();
        System.out.println("");

        //Pedimos que indique el Aforo del Local
        System.out.print("Indique el Aforo del Local= ");
        aforo= sc.nextInt();
        System.out.println("");

        //Pedimos el numero total de Entradas vendidas
        System.out.print("Número de Entradas vendidas= ");
        numeroVendidas= sc.nextInt();

        //Calculamos la recaudación
        recaudacion=numeroVendidas*precioEntrada;

        // Tomar decisiones basadas en el AFORO
        if (numeroVendidas>aforo){
            System.out.println("Buscar otro lugar");
        } else {
            if (numeroVendidas<aforo*0.2){ // si el aforo es menor del 02% se cancela el concierto
                System.out.println("Se CANCELA el concierto");
            } else if (numeroVendidas<aforo*0.5) {
                precioEntrada=precioEntrada-(precioEntrada*0.25);
                recaudacion=numeroVendidas*precioEntrada;
                System.out.println("Entradas al 25%");
            } else {
                System.out.println("El concierto es normal");
            }
            System.out.println("La reudacion del concierto es del " + recaudacion + "€");
        }

    }
}
