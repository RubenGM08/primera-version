package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Tema 3
 * Actividad propuesta 5.1
 * Crear tres tablas de cinco elementos: la primera de enteros, la segunda de double y la
 * tercera de booleanos. Muestra las referencias en las que se encuentra cada una de las
 * tablas anteriores.
 */

public class ActividadPropuesta5_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Indica la longitud de los enteros, dobles y los booleanos a insertar");
        int longitud= sc.nextInt();

        int[] enteros=new int[longitud];
        for (int i=0;i<longitud;i++){
            System.out.println("Indique el entero Nº " + (i+1));
            enteros[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(enteros));

        double[] dobles=new double[longitud];
        for (int i=0;i<longitud;i++){
            System.out.println("Indique el doble Nº " + (i+1));
            dobles[i]= sc.nextDouble();
        }
        System.out.println(Arrays.toString(dobles));

        boolean[] bolean=new boolean[longitud];
        for (int i=0;i<longitud;i++){
            System.out.println("Indique el boolean Nº " + (i+1));
            bolean[i]= sc.nextBoolean();
        }
        System.out.println(Arrays.toString(bolean));


        System.out.println("\t" + enteros);
        System.out.println("\t" + dobles);
        System.out.println("\t" + bolean);
    }
}
