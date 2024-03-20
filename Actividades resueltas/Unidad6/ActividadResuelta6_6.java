package Unidad6;

import java.util.Scanner;

/**
 * Tema 6
 * Actividad Resuelta 6.6
 * Escribir un programa que pida el nombre completo al usuario y lo muestre sin vocales
 * (mayúsculas, minúsculas y acentuadas). Por ejemplo, "Álvaro Pérez" se mostrará <<lvr Prz>>
 */
public class ActividadResuelta6_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nombre, sinVocales= "";
        char c;
        mostrar("Escribe tu Nombre y tu primer apellido");
        nombre= sc.nextLine();
        for (int i = 0; i < nombre.length(); i++) { //recorremos la tabla
            c= nombre.charAt(i);
            if (!esVocal(c)){
                sinVocales = sinVocales + c;
            }
        }
        System.out.println(sinVocales);


    }


    public static boolean esVocal(char c) {
        boolean resultado;
        String vocales = "aeiouáéíóú";
        c= Character.toLowerCase(c); //convertimos c en minusculas
        if (vocales.indexOf(c)==-1) { //buscamos c en la cadena vocales
            resultado=false; //si no es encuentra es que no es unaa vocal
        } else {
            resultado=true; // en caso contraio; es una vocal
        }


        return resultado;
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
