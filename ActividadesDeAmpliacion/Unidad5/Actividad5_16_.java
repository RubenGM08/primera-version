package Unidad5;

import java.util.Scanner;

/**
 * Actividades De Ampliacion
 * Tema 5
 * Actividad 5.16
 * En un juego de rol el mapa puede implementarse como una matriz donde las filas y las
 * columnas representan lugares (lugar 0, lugar 1, lugar 2, etc.) que estarán conectados. Si
 * desde el lugar X podemos ir hacia el lugar Y, entonces la matriz en la posición [x][y] valdrá
 * cierto; en caso contrario, valdrá falso. Escribe una función que, dada una matriz que
 * representa el mapa y dos lugares, indique si es posible viajar desde el primer lugar al se-
 * gundo (directamente o pasando por lugares intermedios).
 *
 */

public class Actividad5_16_ {

    static Scanner sc = new Scanner(System.in);
    static int puntos=0;

    public static void main(String[] args) {
        int next=0;

        do {
            mostrar("¿Continuas jugando? 1->Si | 2->No" );
            next= sc.nextInt();
            partida();

        } while (next!=2);
    }
    public static void partida() {

        //Mapa debe ser booleano
        boolean mapa[][]={
                {true, false, true, true, false},
                {false, true, false, true, true},
                {true, false, true, false, true},
                {false, true, true, false, true},
                {true, false, true, true, true}
        };
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                mostrarSinLn("y=" + i + " | x=" + j);
            }
            mostrar("");
        }
        int x=0;
        int y=0;
        do {
            mostrar("Indique la posicion X de la tabla:");
            x= sc.nextInt();
            mostrar("Indique la posicion Y de la tabla:");
            y= sc.nextInt();
        }while (y>4 || y<0 || x>4 || x<0);
        //creamos un contador, donde mostremos las posiciones que tiene que recorrer en el
        //array para llegar al destino
        int contador=0;
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                contador++;
                if (i==x && j==y){
                    mostrar("El resultado es" + mapa[i][j]);
                    mostrar("Ha recorrido " + contador + " casillas..");
                    if (mapa[i][j]){
                        puntos++;
                    }
                    mostrar("Puntos-> " + puntos);
                    break;
                }
            }

        }
    }

    public static void mostrar(String texto) { System.out.println("\t" + texto); }
    public static void mostrarSinLn(String texto) { System.out.print("\t" + texto); }



}
