package Unidad6;

import java.util.Scanner;

/**
 * Tema 6
 * Actividad Resuelta 6.4
 * Diseñar una aplicación que pida al usuario que untroduzca una frase por teclado e indique
 * cuántos espacios en blanco tiene.
 *
 */
public class ActividadResuelta6_4 {

    //Declaramos el escaner estatico
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        mostrarSinLn("Escribe una frase-> ");
        String texto = sc.nextLine();
        int contadorEspacios = 0;
        char c;

        for (int i = 0; i < texto.length(); i++) {
            c = texto.charAt(i);
            if (Character.isSpaceChar(c)) {
                contadorEspacios++;
            }
        }
        mostrar("Tiene: " + contadorEspacios + " espacios en blanco");
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
