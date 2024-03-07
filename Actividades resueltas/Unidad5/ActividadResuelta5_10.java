package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Tema 5
 * Actividad resuelta 5.10
 * Escribir la función:
 *      int[] eliminarMayores(int t[], int valor)
 * que crea y devuelva una copia de la tabla t donde se han eliminado todos los
 * elementos que son mayores que valor
 */

public class ActividadResuelta5_10 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        tabla();
    }

    public static int[] tabla(){
        mostrar("¿Cuanta longitud quieres para la tabla?");
        int t= sc.nextInt();
        int[] valor = new int[t];
        for (int i = 0; i < valor.length; i++) {
            mostrarSinLn("El " + (i + 1) +"º numero entero es->");
            valor[i]= sc.nextInt();
        }
        mostrar(Arrays.toString(valor));
        Arrays.sort(valor);
        mostrar(Arrays.toString(valor));

        return valor;
    }

    public static int[] eliminarMatores(int t[], int valor){
        int copia[]= Arrays.copyOf(t,t.length); //copia es un clon de t
        int i=0;
        while (i< copia.length){
            if (copia[i] > valor){
                copia[i] = copia[copia.length-1];
                copia = Arrays.copyOf(copia,copia.length-1);
            } else {
                i++;
            }
        }
        return copia;
    }



    public static void mostrar(String texto) { System.out.println("\t" + texto); }
    public static void mostrarSinLn(String texto) { System.out.print("\t" + texto); }



}
