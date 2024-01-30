package Unidad3;

/**
 * Tema 3
 * Actividad resuelta 3.10
 * Diseñar un programa que muestre la suma de los 10 primeros números impares.
 */

public class ActividadResuelta3_10 {
    public static void main(String[] args) {

        int impares, suma=0;

        for (int i=1; i<=10; i+=2){
            impares=i;
            suma+=impares;
            System.out.println(impares);
        }

        System.out.println("La suma de los 10 primeros numeros impares es -> " + suma);

    }
}
