package Unidad5;

import java.util.Arrays;

/**
 * Tema 5
 * Actividad resuelta 5.1
 * Crear una tabla de longitud 10 que se inicializará con números aleatorios comprendidos
 * entre 1 y 100. Mostrar la suma de todos los números aleratorios que se guardan en la tabla.
 */

public class ActividadResuelta5_1 {
    public static void main(String[] args) {
        //Crear el array de numeros
        int[] numeros=new int[10];
        int suma=0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=(int) (Math.random()*100+1);
            suma+=numeros[i];
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println("La suma de todos los elentos = " + suma);
        // salida interesante-> con foreach
        for (int elemento:numeros){
            System.out.print(elemento + " + ");
        }
        System.out.print("= "+ suma);

        String[] id=new String[5];
        //inicializar con un valor predeterminado un array
        Arrays.fill(id,"nombre");
        System.out.println("\n"+Arrays.toString(id));
        double[] puntuacion=new double[10];
        Arrays.fill(puntuacion,0);
        System.out.println(Arrays.toString(puntuacion));
        //inicializa los indices comprendidos de 0 a 5, con el valor de 55
        Arrays.fill(puntuacion,0, 5, 55);
        System.out.println(Arrays.toString(puntuacion));

    }
}
