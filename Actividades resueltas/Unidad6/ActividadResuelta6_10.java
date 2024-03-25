package Unidad6;

import java.util.Scanner;

/**
 * Tema 6
 * Actividad Resuelta 6.10
 * Realizar un programa que lea una frase del teclado y nos indique si es palíndroma, es decir,
 * que la frase sea igual leyendo de izquierda a derecha, que de derecha a izquierda, sin
 * tener en cuenta los espacion. Un ejemplo de frase palínforma es: <Dábale arraoz a la zorra
 * el abad>
 * <p>
 * Las vocacles con tilde hacen que los algoritmos consideren una palíndroma como si
 * no lo fuese. Por esto, supondremos que el usuario introduce la frase sin tildes.
 *
 */

public class ActividadResuelta6_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String frase, invertida, sinEspacios;
        mostrar("Vamos a mirar si la frase que has escrito es palíndroma");
        mostrarSinLn("Escribe la frase-> ");
        frase= sc.nextLine();
        frase= frase.toLowerCase(); // trabajaremos con las letras en minúsculas
        sinEspacios = eliminaEspacios(frase);//devuelve una cadena sin espacios
        invertida = alReves(sinEspacios); //definida en la Act. Resuelta 6.5
        if (sinEspacios.equals(invertida)){
            mostrar("La frase es palíndroma");
        } else {
            mostrar("La frase no es palindroma");
        }

    }

    /**
     * Metodo para quitar los espacios en una frase
     * @param cadena
     * @return
     */
    static String eliminaEspacios(String cadena){
        String sin = "";
        for (int i = 0; i < cadena.length(); i++) { //recorre la cadena
            char c= cadena.charAt(i); //miramos el carácter en la i-ésima posición
            if (!Character.isWhitespace(c)){ // si no es un carácter blanco
                sin = sin + c; //contruimos la cadena sin con c (que no es un blanco)
            }
        }
        return sin;
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
