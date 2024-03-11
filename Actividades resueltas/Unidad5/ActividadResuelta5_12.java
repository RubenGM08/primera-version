package Unidad5;

import java.util.Arrays;

/**
 * Tema 5
 * Actividad resuelta 5.12
 * Crear una trabla bidimensional de longitud 5 x 5 y rellenaria de la siguiente forma: el
 * elemento de la posicion [i][j] debe contener el valor 10 x n + m. Después se debe mostrar
 * su contenido
 */


public class ActividadResuelta5_12 {
    public static void main(String[] args) {
        mostrar(Arrays.deepToString(operacion()));


    }

    public static int[][] operacion(){
        int num[][]=new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                num[i][j]=10*i+j;
            }
        }
        mostrarTabla(num);
        return num;
    }
    //forma de recorrer un Array bidimensional con un foreach
    public static void mostrarTabla(int num[][]) {
        for (int fila[]:num) {
            for (int col:fila){
                mostrarSinLn(col + " ");
            }
            mostrar("");
        }
    }

    public static void mostrar(String texto) { System.out.println("\t" + texto); }
    public static void mostrarSinLn(String texto) { System.out.print("\t" + texto); }

}
