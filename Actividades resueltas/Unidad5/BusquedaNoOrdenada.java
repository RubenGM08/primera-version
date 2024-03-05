package Unidad5;

/**
 * Búsques en Arrays no Ordenados
 * La busqueda se hace por medio de un algoritmo utilizando un bucle para encontrar el primer
 * elemento encontrado dentro del array, mostrando su indice.
 *
 */
public class BusquedaNoOrdenada {
    public static void main(String[] args) {
        int [] numeros= {5, 3, 7, 977, 3, 6, 8, 1, 4, 90, 44};
        mostrar("Longitud de la tabla->"+numeros.length);
        int indice=0;//declaramos el indice en 0 para que comience desde el punto el recorrido del bucle
        int numeroBuscado=44; //Ejemplo de un numero a buscar
        while (indice<numeros.length && numeros[indice]!=numeroBuscado){
            indice++; //se incrementa el indice para ir recorriendo las posiciones del array
        }
        if (indice<numeros.length) // confirmamos que el indice no se ha salido del rango
        mostrar("La posicion del número buscado es ->" + indice);
        else // si es mayor o igual que la longitud, quiere decir que no se ha encontrado el elemento buscado
            mostrar("El numero buscado no esta en la tabla");
        /* Ejemplo de ´búsqueda utilizando una funcion, con cadena de caracteres */
        String nombre[]={"Maria","Pedro","Juan","Irene", "Isabel","José","Alba","Enrique"};
        buscarTexto(nombre,"Ana");
    }

    public static void mostrar(String texto) {
        System.out.print("\n"+texto);
    }

    public static void mostrarSinLn(String texto) {
        System.out.print("\t"+texto);
    }

    public static void buscarTexto(String texto[],String buscar) {
        int indice=0;
        while (indice< texto.length && !texto[indice].equals(buscar)){
            indice++;
        }
        if (indice<texto.length)
            mostrar("La posicion del número buscado es ->" + indice);
        else
            mostrar("El numero buscado no esta en la tabla");


    }

}
