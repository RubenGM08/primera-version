package Unidad6;

import java.util.Scanner;

/**
 * Tema 6
 * Actividad Resuelta 6.5
 * Diseñaruna función a la que se pase una cadena de caracteres y la devuelva invertuda.
 * Un ejemplo, la cadena <<Hola Mundo>> quedaría <<odnuM aloH>>
 *
 */
public class ActividadResuelta6_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String frase= " ", invertida;
        mostrarSinLn("Escribe una frase-> ");
        frase= sc.nextLine();
        mostrar("El texto sin invertir-> " + frase);
        mostrar("La frase invertida-> ");
        invertida= alReves(frase);

    }

    /**
     * Metodo para hacer que una frase se ponga al reves
     * Ejemplo: Hola Mundo -> odnuM aloH
     * @param reves
     * @return
     */
    static String alReves(String reves){
        String nuevo="";

        for (int i = 0; i < reves.length(); i++) {
            nuevo=reves.charAt(i) + nuevo;
        }
        mostrar(nuevo);

        return nuevo;
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
