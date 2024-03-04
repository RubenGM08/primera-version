package Unidad5;

import java.util.Scanner;

/**
 * Tema 5
 * Actividad resuelta 5.4
 * Diseñar la funcion: int maximo(int t[]), que devuelva el máxima valor contenido
 * en la tabla t.
 */
public class ActividadResuelta5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mostrar("Indique el número de elementos enteros a insertar->");
        int longitud= sc.nextInt();
        int numeros[]= new int[longitud];
        for (int i = 0; i < longitud; i++) {
            mostrar("Indique el numero-> ");
            numeros[i]= sc.nextInt();
        }
        //Vamos a mostrar de forma inversa
        mostrar("Muestra de forma inversa los numeros insertados");
        mostrar("-----------------------------------------------");
        for (int i = numeros.length-1; i >=0 ; i--) {
            mostrar("-> " + numeros[i] );
        }
        mostrar("El valor maximo insertaqdo es ->" + maximo(numeros));
    }

    public static void mostrar(String texto) {
        System.out.println("\t"+texto);
    }

    public static int maximo(int[] t) {
        int max=t[0]; //asumimos que al menos hay 1 elemento
        for (int elemento:t){ //recorremos el array pasado por paramtros
            if (elemento>max){ //validamos cada elemento y comparamos con el max acumulado
                max=elemento;
            }
        }

        return max;
    }
}