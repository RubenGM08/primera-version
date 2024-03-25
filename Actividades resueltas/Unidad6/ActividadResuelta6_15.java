package Unidad6;

import java.util.Scanner;

/**
 * Tema 6
 * Actividad Resuelta 6.15
 * Modificar la Actividad resuelta 6.14 para que el programa indique al jugador 2 cuántas letras
 * coinciden (son iguales y estan en la misma posición) entre el texto introducido por
 * él y el original.
 *
 */
public class ActividadResuelta6_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original; //texto original que introduce el jugador 1
        String intento; //intento de acertar la palbra original del jugardor 2
        do {
            mostrarSinLn("Jugador 1. Introduce una palabra: ");
            original = sc.nextLine();
        } while (original.isEmpty());

        String anagrama = crearAnagrama(original);
        System.out.println("A qué palabra correspondo el anagrama: " + anagrama);
        do {
            mostrarSinLn("Jugador 2. ¿Cuál es el original? ");
            intento= sc.next();
            mostrar("Las letras correctas: " + letrasCorrectas(original, intento));
        } while (!original.equals(intento)); // mientras no acierte el texto original
        mostrar("Muy bien..."); //si salimos del bucle es que ha acertado
    }


    /**
     * Metodo para que comprueba cuántas letras coinciden (son iguales y ocupan la misma posición
     * entre las dos cadenas pasadas com parámetros
     * @param a
     * @param b
     * @return
     */
    static int letrasCorrectas(String a, String b){
        int longitudMinima = Math.min(a.length(), b.length());
        //usamos la longitud mínima de ambas cadenas para evitar extraer caracteres de más
        int contadorLetrasCorrectas = 0;
        for (int i = 0; i < longitudMinima; i++) {
            if (a.charAt(i)== b.charAt(i)){
                contadorLetrasCorrectas++;
            }
        }
        return contadorLetrasCorrectas;
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
