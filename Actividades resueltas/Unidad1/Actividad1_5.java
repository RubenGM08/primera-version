package unidad1;

/**
 * Actividad 1_5
 * El tipo short permite almacenar valores comprendidos entre −32 768 y 32 767. Escribir
 * un programa que compruebe que el rango de valores de un tipo se comporta de forma
 * ciclica, es decir, el valor siguiente al máximo es el valor mínimo.
 */

public class Actividad1_5 {
    public static void main(String[] args) {

        short num;
        num = 32767; //valor máximo dentro del rango de short
        System.out.println("Valor máximo para el tipo short: " + num);
        num++; //incrementamos en 1. Para evitar salirse del rango, la
        //variable num tomará el valor mínimo para el tipo short
        System.out.println("Valor mínimo para el tipo short: " + num);
    }
}
