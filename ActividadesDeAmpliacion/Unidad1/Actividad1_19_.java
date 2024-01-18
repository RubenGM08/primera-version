package Unidad1;

import java.util.Scanner;

/**
 * Actividades De Ampliacion
 * Actividad 1.19
 * Una empresa que gestiona un parque acuático te solicita una aplicación que les ayude a
 * calcular el importe que hay que cobrar en la taquilla por la compra de una serie de entradas
 * (cuyo número será introducido por el usuario). Existen dos tipos de entrada: infantiles,
 * que cuestan 15,50 €; y de adultos, que cuestan 20 €.
 * En el caso de que el importe total sea igual o superior a 100 €, se aplicará automáticamente
 * un bono descuento del 5 %.
 *
 */

public class Actividad1_19_ {
    public static void main(String[] args) {

        double entradasAdultos, entradasNinos;
        final double PRECIONINOS= 15.50;
        final double PRECIOADULTOS= 20;
        double total;

        Scanner sc = new Scanner(System.in);

        //Introducion
        System.out.println("Bienvenido a nuestra app de compra de estradas para nuestro parque acuatico: ");

        //Pedimos cuantas entradas quiere comprar para los niños/as
        System.out.println("Cuantas entradas quieres comprar para los niños/as: ");
        entradasNinos= sc.nextInt();
        entradasNinos*= PRECIONINOS;

        //Pedimos cuantas entradas quiere comprar para los adultos
        System.out.println("Cuantas entradas quieres comprar para los adultos: ");
        entradasAdultos= sc.nextInt();
        entradasAdultos*= PRECIOADULTOS;

        System.out.println("");
        //Sacamos cuanto costaria el total de niños y adultos y las dos juntas

        total= entradasNinos + entradasAdultos;
        System.out.println("El precio de las entradas de los niños/as son: " + entradasNinos + "€");
        System.out.println("El precio de las entradas de los adultos son: " + entradasAdultos + "€");
        System.out.println("El precio de todas las entradas juntas es: " + total + "€");

        //Lo ultimo es realizar un descuento del 5% a las compras mayores de 100€
        System.out.println("");
        System.out.println("Para las compras que son iguales o mayor a 100€ se realiza un descuento del 5%");

        double descuento= total>=100 ? total*0.05:total;
        System.out.println("Con descuento seria: " + descuento);

        double resta= total-descuento;
        System.out.println("El precio con el descuneto seria: " +resta);
    }
}
