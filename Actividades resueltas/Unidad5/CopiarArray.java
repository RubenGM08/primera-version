package Unidad5;

import java.util.Arrays;

public class CopiarArray {
    public static void main(String[] args) {
        //Copiar un arry, crear dos arrays con la misma longitud.
        int arrayUno[]=new int[5];
        for (int i = 0; i < arrayUno.length; i++) {
            arrayUno[i]=(int)(Math.random()*100+1);
        }
        mostrar(Arrays.toString(arrayUno));
        //si necesitas copiar un array
        int arrayDos[]=new int[5];
        //**** CopyOf ****
        //CopyOf construye y devuelve una copia del origen al destino con la longitud indicada en el metodo
            arrayDos=Arrays.copyOf(arrayUno,5);
        mostrar(Arrays.toString(arrayDos));
        //CopyOfRange
        //crea y devuelve una tabla donde se copian los elementos indicados en el rango
        int array3[]=Arrays.copyOfRange(arrayUno,2,4);
        mostrar(Arrays.toString(array3));
        //Copiar con un metodo de la clase System
        int array4[]=new int[5];
        System.arraycopy(arrayUno,0,array4,0,arrayUno.length);
        mostrar(Arrays.toString(array4));

    }

    public static void mostrar(String texto) { System.out.println("\t" + texto); }

    public static void mostrarSinLn(String texto) { System.out.println("\t" + texto); }


}
