package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Tema 5
 * Actividad resuelta 5.7
 * Implementar la funcion: int[] sinRepetidos(int t[]), que construye y devuelve una
 * tabla de la longitud apropiada, con los elementos de t, donde se han eliminado los
 * datos repetidos
 *
 */


public class ActividadResuelta5_7 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        mostrar("¿Cuanta longitud quieres parq tu tabla?");
        mostrar("-Pon el numero de la longitud->");
        int longitud= sc.nextInt();
        int numero [] =new int[longitud];
        for (int i = 0; i < numero.length; i++) {
            numero[i]=(int) (Math.random()*20+1);
        }
        mostrar("-Tabla no ordenada");
        mostrar(Arrays.toString(numero));
        sinRepetidos(numero);

    }

    public static void sinRepetidos(int t[]) {
            int sinDuplicar[]=new int[0];
        for (int i = 0; i < t.length; i++) {
            if (!buscarNumero(sinDuplicar,t[i])){
                sinDuplicar=Arrays.copyOf(sinDuplicar,sinDuplicar.length+1);
                sinDuplicar[sinDuplicar.length-1]=t[i];
            }
        }

        System.out.println(Arrays.toString(sinDuplicar));
    }

    public static boolean buscarNumero(int tabla[],int numero) {
        boolean existe=false;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i]==numero){
             existe=true;
            }
        }
        return existe;
    }







    public static void mostrar(String texto) { System.out.println("\t" + texto); }

    public static void mostrarSinLn(String texto) { System.out.println("\t" + texto); }

}
