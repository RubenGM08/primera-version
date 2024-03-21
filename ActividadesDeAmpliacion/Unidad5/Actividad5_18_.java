package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Tema 5
 * Actiidades de Ampliacion
 * @autor Rubén García Mateos
 * Escribe un programa que solicite los elementos de una matriz de tamaño 4 x 4. La aplicación
 * deve decidir si la matriz introducida corresponde a una matriz mágica, que es aquella
 * donde la suma de los elementos de cualquier fila o de cualquier columna valen lo mismo.
 *
 */
public class Actividad5_18_ {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int matriz[][]=new int[4][4];
        /*Bucle para socilitar los datos a incluir en la matriz*/
        for (int i = 0; i < 4; i++) {
            /* en el bucle se recorre cada ina de las comunlas de esa fila
             * si i=0
             * 00 01 02 03
             * */
            for (int j = 0; j < matriz[i].length; j++) {
                mostrarSinLn("Introduce los elementos de la fila-> " + i + " y de la columna-> " + j + " ");
                matriz[i][j]= sc.nextInt();

            }
        }
        //mostrar la matriz de forma ordenada
        for (int i = 0; i < 4; i++) {
            mostrar(Arrays.toString(matriz[i]));

        }

        //aalgoritmo que sume los valores de las columnas y sume los valores de las filas, luego comparar
        //si alguna suman los mismo para indicar que es una matriz mágica


        boolean esMagica=true;
        int suma=0;

        //recorremos las filas y sumamos
        for (int i = 0; i < 4; i++) {
            suma+=matriz[0][i];
        }
        mostrar("Suma-> " + suma);
        //
        for (int j = 0; j < 4; j++) {
            int sumaColumna=0;
            for (int k = 0; k < 4; k++) {
                sumaColumna+=matriz[k][j];
            }
            mostrar("Suma columna-> " + sumaColumna);
            if (sumaColumna!=suma){
                esMagica=false;
            }
        }

        // suma de filas
        for (int fila = 0; fila < 4; fila++) {
            int sumaFila=0;
            for (int columna = 0; columna < 4; columna++) {
                sumaFila+=matriz[fila][columna];
            }
            if (sumaFila!=suma){
                esMagica=false;

            }
        }

        if (esMagica) mostrar("La matriz es magica");
        else mostrar("La matriz no es mágica");
    }




    /**
     * Metodo para mostrar en consola los texto con salto de línea
     * @param texto
     */

    public static void mostrar(String texto) { System.out.println("\t" + texto); }


    /**
     * Metodo para mostrar en consola los texto con salto de línea
     * @param texto
     */

    public static void mostrarSinLn(String texto) { System.out.print("\t" + texto); }

}
