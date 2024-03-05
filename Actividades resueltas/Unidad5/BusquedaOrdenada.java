package Unidad5;

import java.util.Arrays;

public class BusquedaOrdenada {
    public static void main(String[] args) {
        int numeros[]={5,6,7,2,3,7,8,3,4,5,7,8};
        mostrar("Longitud-> " +numeros.length);
            mostrar("- Sin Ordenar");
        mostrar(Arrays.toString(numeros));
            Arrays.sort(numeros);
            mostrar("- Ordenado");
        mostrar(Arrays.toString(numeros));
        //Despues de ordenar el array, se puede buscar un elemento con la calse
            // binarySeach(nombreArray,elementoAbuscar)
            //El resultado de esta calse es un entero, si es positivo, es el indice donde se encuentra
            //si es negativo mmenor que 0, es el indice donde deberia ir posicionado ese elemento buscado pero
            //que no se encuentra
            int pos=Arrays.binarySearch(numeros, 8);
            mostrar("Posicion-> " + pos);
            if (pos < 0) {
                mostrar("Este numero no existe en la tabla");
                int indiceInsertar=pos-1;
                mostrar("El numero insertado deberia ir en el indice " + indiceInsertar + " para mantener la tabla ordenada");
            }
    }

    public static void mostrar(String texto) {
        System.out.print("\n"+texto);
    }

    public static void mostrarSinLn(String texto) {
        System.out.print("\t"+texto);
    }

}
