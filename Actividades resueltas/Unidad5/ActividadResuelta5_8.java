package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Tema 5
 * Actividad resuelta 5.8
 * Leer y amacenar un números enteros en una tabla, a partir de la que se construirán otras
 * dos tablas con los elementos con valores pares e impares de la primera, respectivamente.
 * Las tablas pares e impares deben mostrarse ordenadas.
 *
 */

public class ActividadResuelta5_8 {

    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        pares(tabla());


    }

    public static int[] tabla() {
        mostrar("¿Cuanta longitud quieres para tu tabla?");
        int longitud= sc.nextInt();
        int numero[] = new int[longitud];
        for (int i = 0; i < numero.length; i++) {
            mostrarSinLn("Pon el " + (i+1) + "º numero entero-> ");
            numero[i]= sc.nextInt();
        }

        mostrarSinLn(Arrays.toString(numero));

        return numero;

    }

    public static void pares(int numero[]) {
        int par[]=new int[0];
        int impar[]=new int[0];
        for (int i = 0; i < numero.length; i++) {
            if (numero[i]%2==0){
                //incluir en el array de par
                par=Arrays.copyOf(par,par.length+1);
                par[par.length-1]=numero[i];
            } else {
                //incluir en la de impares
                impar=Arrays.copyOf(impar,impar.length+1);
                impar[impar.length-1]=numero[i];
            }
        }
        mostrar("Los numeros enteros pares introducidos son-> ");
        mostrar(Arrays.toString(par));
        mostrar("Los numeros enteros impares introducidos son-> ");
        mostrar(Arrays.toString(impar));
    }



    public static void mostrar(String texto) { System.out.println("\t" + texto); }

    public static void mostrarSinLn(String texto) { System.out.print("\t" + texto); }

}
