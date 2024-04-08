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
    public void insertarConIndice(int indice, Integer nuevo){
        //Validamos que el indice pasado por parametro es menor que la longitud del array
        if (elemento.length>indice){
            elemento= Arrays.copyOf(elemento,elemento.length+1);
            System.arraycopy(elemento,indice,elemento,indice+1,elemento.length-indice-1);
            //[1,2,3,4,5,6,7] -> 4,10 -> [1,2,3,4] [5,6,7] -> [1,2,3,4,10,5,6,7]
            elemento[indice]=nuevo;
        }else {
            System.out.println("El indice indicado esta fuera de rango!");
        }
    }

        //Insertar otra lista de la lista original
        public void insertarLista(Lista nuevaLista){
            //1. la longitud de la lista inicial
            int logOriginal= elemento.length;
            //2. Hacer hueco
            elemento=Arrays.copyOf(elemento,elemento.length+nuevaLista.elemento.length);
            //Ejem. [60, 50, 100, null, null, null, null, null, null, null, null]
            System.out.println(Arrays.toString(elemento));
            //nueva lista tiene 5 elementos....7,11
            //3. Copiar la lista
            System.arraycopy(nuevaLista.elemento,0,elemento,logOriginal,nuevaLista.elemento.length);
            //Ejem. [60, 50, 100, 1, 2, 3, 4, 10, 5, 6, 7]
            System.out.println(Arrays.toString(elemento));
        }

        public void eliminarIndice(int indice){
            if (elemento.length>indice && indice>=0){
                Integer numEliminar; // el dato tipo Weapper se declara como null
                numEliminar=elemento[indice];//eje: 100 - indice= 2
                for (int i = indice+1; i < elemento.length; i++) {
                    elemento[i-1]=elemento[i];
                }
                elemento=Arrays.copyOf(elemento,elemento.length-1);
                System.out.println("El numero ["+ numEliminar + "] sera eliminado del array");
                System.out.println(Arrays.toString(elemento));
            }
        }

        //buscar un número que pasen por parámetros
        public void buscarNumero(Integer numero){
            int indice=-1; //
            for (int i = 0; i < elemento.length && indice==-1; i++) {
                //para comparar el Integer==..sino equal -> porque es un Array
                if (elemento[i].equals(numero)){
                    indice=i;
                }
            }
            if (indice!=-1){
                System.out.println("El numero buscado [" + numero + "] esta en la posicion-> " + indice);
            } else {
                System.out.println("El numero buscado [" + numero + "] no ha sido encontrado");
            }

        }

}
