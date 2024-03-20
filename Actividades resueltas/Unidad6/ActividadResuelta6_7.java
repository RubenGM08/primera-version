package Unidad6;

import java.util.Scanner;

/**
 * Tema 6
 * Actividad Resuelta 6.7
 * Diseñar un programa que solicite al usuario una frase y una palabra. A continuación bus-
 * cará cuántas veces aparece la palabra en la frase
 */
public class ActividadResuelta6_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String frase, palabra;
        char c;
        int contadorPalabra=0, posicion;
        mostrarSinLn("Escribe una frase-> ");
        frase= sc.nextLine();
        mostrarSinLn("\nLetra que quieras buscar-> ");
        palabra= sc.nextLine();
        posicion = frase.indexOf(palabra);
        while (posicion!=-1){
            contadorPalabra++;
            posicion=frase.indexOf(palabra, posicion + 1);
        }
        if (contadorPalabra==0){
            mostrar("\"" + palabra + "\" no se ha encontrado en la frase " + frase);
        }
            mostrar("\"" + palabra + "\" esta " + contadorPalabra + " veces");
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
