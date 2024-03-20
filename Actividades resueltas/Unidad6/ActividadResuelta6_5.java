package Unidad6;

/**
 * Tema 6
 * Actividad Resuelta 6.5
 * Diseñaruna función a la que se pase una cadena de caracteres y la devuelva invertuda.
 * Un ejemplo, la cadena <<Hola Mundo>> quedaría <<odnuM aloH>>
 *
 */
public class ActividadResuelta6_5 {
    public static void main(String[] args) {

        String texto="Hola Mundo";
        mostrar("El texto sin invertir-> " + texto);
        String nuevo="";

        for (int i = 0; i < texto.length(); i++) {
            nuevo=texto.charAt(i) + nuevo;
        }
        mostrar(nuevo);

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
