package Unidad5;

import java.util.Arrays;

public class CopiarInsertarOrdenada {
    public static void main(String[] args) {

        int t [] ={1,2,3,4,6,7,8,9};
        int nuevo = 5;
        System.out.println(Arrays.toString(t));
        int indiceInsercion = Arrays.binarySearch(t, nuevo);
        //si el indiceInsercion >=0, el nuevo elemento (que está repetido) se inserta en
        //el lugar que ya estaba, desplazando el original. Si por el contrario:
        if (indiceInsercion<0){ //si no lo encuentra
            //calcula donde deberia estar
            indiceInsercion= -indiceInsercion-1;
        }
        int copia[] = new int[t.length+1];
        //copiamos los elementos antes del "huevo"
        System.arraycopy(t, 0,copia, 0, indiceInsercion);
        System.out.println(Arrays.toString(copia)); //mostramos
        //copiamos desplazados los elementos tras el "hueco"
        copia[indiceInsercion]=nuevo; //asignamos el nuevo elemento
        System.out.println(Arrays.toString(copia)); //mostramos
        System.arraycopy(t,indiceInsercion,copia,indiceInsercion+1, t.length - indiceInsercion);
        System.out.println(Arrays.toString(copia)); //mostramos
        t=copia; //t referencia la nueva tabla
        System.out.println(Arrays.toString(t)); //mostramos




    }
}
