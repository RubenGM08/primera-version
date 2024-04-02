package Unidad7.Actividad7_11R.Clases;

import java.util.Arrays;

public class Lista {
    Integer[] elemento;

    public Lista() {
        elemento=new Integer[0];
    }

    //Insertar al principio de la lista...crecer en 1 el array
    public void insertarPrincipio(Integer nuevo){
        //1. Amuntar la tabla
        elemento= Arrays.copyOf(elemento,elemento.length+1);
        //2. Crear hueco al principio de la tabla
        System.arraycopy(elemento,0,elemento,1,elemento.length-1);
        //3. Insetar el elemento
        elemento[0]=nuevo;
    }

    //insertar en el ultimo sitio de la tabla
    public void insertarUltimo(Integer nuevo){
        elemento= Arrays.copyOf(elemento,elemento.length+1);
        elemento[elemento.length-1]=nuevo;
    }

    //Obtener el numero de elementos insertados
    public void mostrarElementos(){
        System.out.println("Numero de elementos-> " + elemento.length);
        System.out.println("Todos los Elementos-> " + Arrays.deepToString(elemento));
    }

    //Insertar un elemento y nos indican donde insertarlo
    public void insertrConIndice(int indice,Integer nuevo){
        elemento= Arrays.copyOf(elemento,elemento.length+1);
        System.arraycopy(elemento,indice,elemento,indice+1,elemento.length-indice-1);
        //[1,2,3,4,5,6,7] -> 4,10 -> [1,2,3,4] [5,6,7] -> [1,2,3,4,10,5,6,7]
        elemento[indice]=nuevo;

    }



}
