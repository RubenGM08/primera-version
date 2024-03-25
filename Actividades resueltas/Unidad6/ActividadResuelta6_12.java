package Unidad6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Tema 6
 * Actividad Resuelta 6.12
 * Un anagrama es una palabra que resuelta del cambio del orden de los caracteres de otra.
 * Ejemplos de anagramas para la palabra roma son: amor, ramo o mora. Contruir un programa
 * que solicite al usuario dos palabras e indique si son anagramas una de otra. */
public class ActividadResuelta6_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mostrarSinLn("Escribe una palabra: ");
        String palabra1, palabra2;
        palabra1 = sc.next();
        palabra1= palabra1.toLowerCase(); //convertimos la palabra a minúsculas
        mostrarSinLn("Escriba otra: ");
        palabra2= sc.next();
        palabra2= palabra2.toLowerCase();
        if (palabra1.length() != palabra2.length()){//si no son de distintos tamaño
            mostrar("No son anagramas");//no pueden ser anagramas
        } else {
            char p1[]= palabra1.toCharArray(); // es mas facil ordenar una tabla
            char p2[]= palabra2.toCharArray(); //convertimos las palabras a tablas
            Arrays.sort(p1); // ordenamos ambas tablas
            Arrays.sort(p2);
            if (Arrays.equals(p1,p2)){ //si las tablas son iguales tienen las
                                       // mismos letras
                mostrar("Son anagramas"); //son anagramas
            } else {
                mostrar("No son anagramas");
            }
        }

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
