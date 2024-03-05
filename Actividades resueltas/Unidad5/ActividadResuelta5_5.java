package Unidad5;
/**
 * Tema 5
 * Actividad resuelta 5.5
 * Escribir la función int[[ rellenaPares(int longitud, int final), que crea y devuelva
 * una tabla ordenada de la longitud especificada, que se encuentra rellena con números
 * pares aleatorios comprendidos en el rango desde 2 hasta el fin(inclusive)
 */

import java.util.Arrays;
import java.util.Scanner;

public class ActividadResuelta5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mostrarSinLn("Indica la longitud de la tabla->");
        int longitud= sc.nextInt();
        mostrarSinLn("Indica el número fin de los números aleatorios->");
        int fin=sc.nextInt();
        int pares[]=new int[longitud];
        for (int i = 0; i < pares.length; i++) {
            int num=(int)(Math.random()*fin+1);
            if (num%2==0){
                pares[i]=num;
            }else {
                i--;
            }

        }
        Arrays.sort(pares);
        mostrar("Tabla Ordenada-> " + Arrays.toString(pares));
    }

    public static void mostrar(String texto) {
        System.out.println(texto);
    }

    public static void mostrarSinLn(String texto) {
        System.out.println(texto);
    }
}
