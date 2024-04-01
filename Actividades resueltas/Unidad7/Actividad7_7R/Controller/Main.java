package Unidad7.Actividad7_7R.Controller;

import Unidad7.Actividad7_7R.Clases.Texto;

/**
 * Tema 7
 * Actividad Resuelta 7.7
 * Diseñar la clase Texto que gestiona una cadena de caracteres con algunas características:
 *     -La cadena de caracteres tendrá una longitud máxima que se especifica en el cons-tructor
 * <p>
 *     -Permite añadir un carácter al principio o al final, siempre y cuando no se exceda la
 *      longitud máxima, es decir, exista espacio disponibl
 * <p>
 *     -Igualmente, permite añadir una cadena, al principio o al final del texto, siempre y
 *      cuando no se rebase el tamaño máximo establecido
 * <p>
 *     -Es necesario saber cuántas vocales (mayúsculas y minúsculas) hay en el texto
 * <p>
 *     -Cada objeto de tipo Texto tiene que conocer la fecha en la que se creó, así como la
 *      fecha y hora de la última modificación efectuada
 * <p>
 *     -Deberá existir un método que muestre la información que gestiona cada texto.
 */

public class Main {

    public static void main(String[] args) {
    Texto t=new Texto(6);
    t.addFinal('e');
    System.out.println(t.toString());
    String cadena="Era";
    t.addCadenaFinal(cadena);
    System.out.println(t.toString());
    t.addPrincipio('a');
    System.out.println(t.toString());
    System.out.println("La cadena tiene-> " + t.contarVocales() + " vocales");







    }
}
