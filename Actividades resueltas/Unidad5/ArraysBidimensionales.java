package Unidad5;

/*
* Solicitar al usuario que genere una tabla de 5x5
*
*/

import java.util.Arrays;
import java.util.Scanner;

public class ArraysBidimensionales {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // socilito que muestre el resultado de la funcion
        mostrar(Arrays.deepToString(solicitarNumero()));


    }

    public static int[][] solicitarNumero() {
        int numeros[][]=new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mostrar("Ingrese el numero de la fila " + i + " y la columna " + j + " ->");
                numeros[i][j]= sc.nextInt();
            }
        }

        return numeros;
    }


    public static void mostrar(String texto) { System.out.println("\t" + texto); }
    public static void mostrarSinLn(String texto) { System.out.println("\t" + texto); }

}
