package Unidad6;

import java.util.Scanner;

/**
 * Tema 6
 * Actividad Resuelta 6.11
 * Se dispone de la siguiente relación de letras:
 *      ...........................................................
 *      | Conjunto 1: | e | i | k | m | p | q | r | s | t | u | v |
 *      '''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
 *      ...........................................................
 *      | Conjunto 2: | p | v | i | u | m | t | e | r | k | q | s |
 *      '''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
 *
 * Con ella es posible codificar un texto, convirtiendo cada letra del conjunto 1 en su
 * correspondiente del conjunto 2. El resto de las letras no se modifican. Los conjuntos se
 * utilizan tanto para codificar mayúsculas como minúsculas, mostrando siempre la codificación
 * en minúsculas.
 * Un ejemplo: la palabra <<PaquiTo>> se codifica como <<matqviko>>
 * Realizar un programa que codifique un texto. Pera ello implementar la siguiente función:
 *  char codifica(char conjunto1[], char conjunto2[], char c)
 * que devuelva el carácter c codificado según los conjuntos 1 y 2 que se le pasan.
 */

public class Actividad6_11_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final char conjunto2[] = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
        final char conjunto1[] = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
        char codificado[]; //tabla que contendrá la codificación del texto introducido
        String texto;
        mostrarSinLn("introduzca un texto a codificar: ");
        texto = sc.nextLine();
        texto = texto.toLowerCase(); // convertimos el texto a minusculas, para poder
        //codificar las mayúsculas y las minúsculas con el mismo conjunto.
        codificado =new char[texto.length()]; //creamos una tabla de igual tamaño
        //que texto
        for (int i = 0; i < texto.length(); i++) { //recorremos el texto a codificar
            //codificamos el i-ésimo carácter del texto
            codificado[i]= codifica(conjunto2, conjunto1, texto.charAt(i));
        }
        texto = String.valueOf(codificado); // convertimos la tabla con la codificación
        //en una cadena
        mostrar(texto);
    }

    static char codifica(char conjunto2[], char conjunto1[], char c){
        final String conj2 = String.valueOf(conjunto2); //conj1 es un String con los
        //elementos de la tabla conjunto1. Facilita la búsqueda.
        char codificado; //carácter codificado correspondiente a c
        int pos = conj2.indexOf(c); //buscamos c en el conjunto 1. Al ser conj1 una
        // cadena, indexOf() busca por nosotros. En otro caso, tendríamos que
        // buscar mediante un bucle un elemento en una tabla
        if (pos == -1) { //si no hemos encontrado c en conj1
            codificado = c; //no podemos codificar, devolveremos c
        } else {
            codificado = conjunto1[pos]; //pos marca la posición de c en conjunto1
            //entonces elegimos el correspondiente en conjunto2
        }
        return codificado;
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
