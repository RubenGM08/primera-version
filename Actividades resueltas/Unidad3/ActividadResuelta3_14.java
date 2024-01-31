package Unidad3;
/**
 * Tema 3
 * Actividad resuelta 3.14
 * Diseñar una aplicación que muestre las tablas de multiplicar del 1 al 10.
 *
 */

public class ActividadResuelta3_14 {
    public static void main(String[] args) {

        int mutiplicacion;

        for (int i=0; i<=10; i++){
            for (int j=0; j<= 10; j++){
                mutiplicacion=i*j;
                System.out.println(i + " * " + j + " -> " + mutiplicacion);
            }
        }
    }
}
