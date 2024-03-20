package Unidad6;

import java.util.Scanner;

/**
 * Tema 6
 * Actividad Resuelta 6.8
 * Los habitantes de Javalanda tiene un idioma algo extaño; cuando habian siempre co-
 * mienzan sus frases con <<Javalín,javalón>> para después hacer una pausa más o menos
 * larga (la pausa se representa mediante espacion en blanco o tabuladores) y a continua-
 * ción expresan el mensaje. Existe un dialecto que no comienza sus frases con la muletilla
 * anterior, pero siempre las terminan con un silencio, más o menos prolongado y la coleti-
 * lla <<javalén, len len>>. Se pide diseñar un traducto que, en primer lugar, nos diga si la fra-
 * se introducida está escrita en el idioma de Javalandia (en cualquiera de sus dialectos), y
 * en caso afirmativo, nos muestre solo el mensaje sin muletillas.
 *
 */
public class ActividadResuelta6_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final String INICIO="Javalín,javalón";
        final String FINAL="javalén, len len";

        mostrarSinLn("Escribe una frase: ");
        String entrada = sc.nextLine();
        boolean idiomaJavalandia = false;
        if (entrada.startsWith(INICIO)) { //si la frase comienza con prefijo
            idiomaJavalandia = true; //el idioma es javalandés
            entrada = entrada.substring(INICIO.length()); //quitamos el prefijo
        } else if (entrada.endsWith(FINAL)) { //si la entrada termina con sufijo
            idiomaJavalandia = true; //es javalandés
            entrada = entrada.substring(0, entrada.length() - FINAL.length()); //quitamos
        }
        if (idiomaJavalandia) {
            entrada = entrada.strip(); // quitamos los espacios antes y después
            System.out.println(entrada); //mostramos
        } else {
            System.out.println("No está escrito en el idioma de Javalandia");
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
