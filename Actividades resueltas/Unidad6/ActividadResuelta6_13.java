package Unidad6;

import java.util.Scanner;

/**
 * Tema 6
 * Actividad Resuelta 6.13
 * Diseñar un algoritmo que lea del teclado una frase e indique, para cada letra que aparece
 * en la frase, cuántas veces se repite. Se consideran iguales las letras mayúsculas y las
 * minúsculas para realizar la cuenta. Un ejemplo sería:
 *
 *      Frase: En un lugar de la mancha .
 *      Resultado:
 *      a:  4 veces
 *      c:  1 vez
 *      d:  1 vez
 *      e:  2 veces
 *             ...
 */
public class ActividadResuelta6_13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String frase;
        int[] numVeces; //contador de las ocurrencias de cada letra
        mostrarSinLn("Escribe una frase: ");
        frase= sc.nextLine();
        //para contabilizar tambien las mayusculas pasamos a minuscuklas
        frase = frase.toLowerCase();
        // Cada posicion de numVeces guardara el número de ocurrencias de una letra.
        // numVeces[0] para la letra 'a', numVeces[1] para la 'b', numVeces[2] para la 'c'...
        numVeces= new int['z' - 'a' + 1]; // tantas veces componentes como letras.
        //La tabla se crea con todos los elementos inicializados a 0
        for (int i = 0; i < frase.length(); i++) {//recorremos la frase carácter a carácter
            if (Character.isLetter(frase.charAt(i))){ // si el i-esimo caracter es una letra
                numVeces[frase.charAt(i) - 'a' ]++; //incrementamos el contador de esa letra
            }
        }
        for (int i = 0; i < 'z' - 'a' + 1; i++) {//mostramos numVeces
            if (numVeces[i] !=0) { //solo las letras que aparecen en frase
                mostrar("La letra " + (char) (i + 'a') +
                        " se repite " + numVeces[i] + " veces");
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
