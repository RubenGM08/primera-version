package Unidad4;

import java.util.Scanner;

/**
 * Tema 4
 * Actividad resuelta 4.3
 * Realizar una función que calcule y muestre el área o el volumen de un cilindro, según se
 * especifique. Para duistinguir un caso de otro se le pasará como opción un número: 1 (para
 * el área) o 2 (para el volumen). Además, hay que pasarle a la función el radio de la base y la altura
 */

public class ActividadResuelta4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el radio del cilindro ->");
        int radio= sc.nextInt();
        System.out.println("Dame la altura del cilindro ->");
        int altura= sc.nextInt();

        System.out.println("\nVamos a realizar un funcion");
        System.out.println("Opcion 1= Calcular el area" +
                "\t\nOpcion 2= Calcular el volumen");
        System.out.print("\nVamos a elegir una opcion ->");
        int opcion= sc.nextInt();

        muestraResultado(radio,altura,opcion);

    }

    public static void muestraResultado(int radio, int altura, int opcion) {

        double area, volumen;

        if (opcion==1){
            area= ((2*Math.PI)* radio *(altura+radio));
            System.out.println(area);
        } else if (opcion==2) {
            volumen= Math.PI * Math.pow(radio,2) * altura;
            System.out.println(volumen);
        }
    }

}
