package Unidad6;

import java.util.Scanner;

/**
 * Tema 6
 * Activida Resuelta 6.14
 * Implementar el juego del anagrama, que consiste en que un jugador escribe una palabra y
 * la aplicacion muestre un anagrama(cambio del orden de los caracteres) generando al azar.
 * A continuación, otro jugador tiene que acertar cuál es el texto original. La aplicacion no
 * debe permitir que le texto introducido por el jugador 1 sea la cadena vacia, Por ejemplo,
 * si el jugador 1 escribe <<teclado>>, la aplación muestra como pista un anagrama al azar,
 * como por ejemplo: <<etcloda>>
 */
public class ActividadResuelta6_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original; //texto original que introduce el jugador 1
        String intento; //intento de acertar la palbra original del jugardor 2
        int contadorfallos=0;
        do {
        mostrarSinLn("Jugador 1. Introduce una palabra: ");
        original = sc.nextLine();
        } while (original.isEmpty());

        String anagrama = crearAnagrama(original);
        System.out.println("A qué palabra correspondo el anagrama: " + anagrama);
        do {
            mostrarSinLn("Jugador 2. ¿Cuál es el original? ");
            intento= sc.next();
            contadorfallos++;
        } while (!original.equals(intento)); // mientras no acierte el texto original
        mostrar("Muy bien..."); //si salimos del bucle es que ha acertado
        mostrar("Intentos realizados-> " + contadorfallos);
    }

    /**
     * Metodo para modificar una palabra original a la palabra pero deformada
     * Ejemplo: teclado -> etcloda
     * @param original
     * @return
     */
    static String crearAnagrama(String original){
        char anagrama[]= original.toCharArray(); //una tabla es más cómoda para modificar

        //realizamos un intercambio al azar para cada carácter que forma el texto
        for (int numCambios = 0; numCambios < anagrama.length; numCambios++) {
            int i = (int) (Math.random() * anagrama.length); //índice al azar
            int j = (int) (Math.random() * anagrama.length); //índice al azar
            char aux = anagrama[i]; //intercambiamos anagrama [i] y anagrama [j]
            anagrama[i]= anagrama[j];
            anagrama[j]= aux;
        }
        return String.valueOf(anagrama); //devolvemos un String a partir la tabla
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
