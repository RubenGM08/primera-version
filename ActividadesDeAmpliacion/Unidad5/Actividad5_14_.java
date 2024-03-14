package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Actividades De Ampliacion
 * Tema 5
 * Actividad 5.14
 * El ayuntamiento de tu localidad te ha encargado una aplicación que ayude a realizar
 * encuestas estadísticas para conocer el nivel adquisitivo de los habitantes del municipio. Para
 * ello, tendrás que preguntar el sueldo a cada persona encuestada. A priori, no conoces el
 * número de encuestados. Para finalizar la entrada de datos, introduce un sueldo con
 * valor -1
 * Una vez terminada la entrada de datos, muestra la siguiente información:
 *    Todos los sueldos introducidos ordenados de forma decreciente.
 *    El sueldo máximo y mínimo.
 *    La media de los sueldos.
 */

public class Actividad5_14_ {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        double sueldo[]=altaSueldo();
        mostrarDecreciente(sueldo);
        mostrarMaxMin(sueldo);
        mediaSueldo(sueldo);

    }

    //Metodo de insertar los sueldo
    public static double[] altaSueldo() {
        double sueldo[]=new double[0];
        //el bucle While que hasta que no se escriba -1 na salga del bucle
        double sueldoAux=0;
        do {
        mostrarSinLn("Ingrese el sueldo-> ");
        sueldoAux= sc.nextDouble();
            if (sueldoAux!=-1){
                sueldo= Arrays.copyOf(sueldo,sueldo.length+1);
                sueldo[sueldo.length-1]=sueldoAux;
            }
        } while (sueldoAux!=-1);

        //enviamos el resultado
        Arrays.sort(sueldo);
        return sueldo;
    }

    //Metodo para mostrar decreciente
    public static void mostrarDecreciente(double sueldo[]) {
        for (int i = sueldo.length-1; i >=0 ; i--) {
            mostrarSinLn(" "+sueldo[i]+" ");
        }
    }

    //Metodo para indicar max y min de una tabla ordenada
    public static void mostrarMaxMin(double sueldo[]) {
        mostrar("Sueldo mayor-> " + (sueldo[sueldo.length-1]));
        mostrar("Sueldo menor-> " + sueldo[0]);
    }

    public static void mediaSueldo(double sueldo[]) {
        double suma=0;
        for (int i = 0; i < sueldo.length; i++) {
            suma+=sueldo[i];
        }
        double media=suma/sueldo.length;
        mostrar("La media del sueldo es-> " + media + "€");
    }


    public static void mostrar(String texto) { System.out.println("\t" + texto); }
    public static void mostrarSinLn(String texto) { System.out.print("\t" + texto); }


}
