package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Tema 5
 * Actividad resuelta 5.9
 * Diseñar una aplicación para gestinar un campeonato de programación, donde se introduce
 * la puntuación (enteros) obtenidos por 5 programadores, conforme van terminando su
 * prueba. La aplicación debe mostrar las puntuaciones ordenadas de los 5 participantes. N
 * ocasiones, cuando finalizan los 5 participantes anterioresm se suman al campeonato
 * programadores de exhibición, cuyos puntos se incluyen con el resto. La forma de especificar
 * que no interviene más programadores de exhibición es introducir como puntuación -1.
 * La aplicacion debe mostrar, finalmente los puntos ordenados de todos los participantes.
 *
 */

public class ActividadResuelta5_9 {

    static Scanner sc = new Scanner (System.in);

    public static void main(String[] args) {
        puntuacion();

    }

    public static int [] puntuacion() {
        mostrarSinLn("Bienvenido al campeonato de programación");
        int[] puntos=new int[5];
        for (int i = 0; i < 5; i++) {
            mostrar("Puntos programador (" + (i + 1) + "): ");
            puntos[i] = sc.nextInt();;//leemos los datos, que no estan ordenados

        }
        Arrays.sort(puntos); //ordenamos
        mostrarSinLn("Los puntos de los programadores son-> " + Arrays.toString(puntos));


        mostrar("Indica la puntuacion de exhibicion");
        int puntProgExh= sc.nextInt(); //puntuacion del prog. de exhibicion
        while (puntProgExh!=-1){
            int pos = Arrays.binarySearch(puntos,puntProgExh); //buscamos
            int indiceInsercion; //donde insertar para que la tabla siga ordenada
            if (pos<0){
                indiceInsercion= -pos -1; // indice para que la tabla esté ordenada
            } else {
                indiceInsercion= pos; //puntuacion repetida, ya esta en la tabla
            }

        int copia[]= new int[puntos.length+1]; //nueva tabla con longitud+1
            //copiamos los elemtos antes de "hueco
            System.arraycopy(puntos, 0, copia, 0, indiceInsercion);
            //copiamos desplazados los elementos tras el "hueco"
            System.arraycopy(puntos,indiceInsercion,copia,indiceInsercion+1,puntos.length-indiceInsercion);
            copia[indiceInsercion] = puntProgExh;
            puntos=copia; //puntos referencia la nueva tabla
            mostrar("Puntos del programador de exhibición:");
            puntProgExh= sc.nextInt(); //puntuacion del prog. de exhibicion

        }

        mostrar("Puntuacion final: " + Arrays.toString(puntos));
        return puntos;
    }


    public static void mostrar(String texto) { System.out.println("\t" + texto); }
    public static void mostrarSinLn(String texto) { System.out.println("\t" + texto); }

}
