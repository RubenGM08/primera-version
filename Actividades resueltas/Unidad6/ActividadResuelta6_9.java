package Unidad6;

import java.util.Scanner;

/**
 * Tema 6
 * Actividad Resuelta 6.9
 * Introducir por teclado una frase palabra a palabra, y mostrar la frase completa séparando
 * las palabras introducidas con espacios en blanco. Terminar de leer la frase cuando algu-
 * na de las palabras introducidas sea cadena <<fin>> escrita con cualquier combinación de
 * mayúsculas y minúsculas. La cadena <<fin>> no aparecerá en la frase final.
 */
public class ActividadResuelta6_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = "", palabra; //frase debe inicializarse con la cadena vacía
        //ya que vamos a concatenarle otra cadena.
        //leemos la primera palabra fuera del bucle por si es "fin"
        mostrarSinLn("Escriba una palabra");
        palabra= sc.next();
        while (!palabra.toLowerCase().equals("fin")){
            frase = frase + " " + palabra; //concatenamos la palabra al final de la
            //frase, con un espacio en blanco. La primear vez, frase está
            //inicializada con la palabra vacía. Si no, produciría un error.
            mostrarSinLn("Escribe una palabra: ");
            palabra= sc.next();
        }
        //Sea cual sea la combinación de mayúsculas/minúsculas de palabra, la
        //convertimos a minúscula para compararla con "fin". Se podría convertir a
        //mayúsculas y comparar con "FIN"
        mostrar(frase);
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
