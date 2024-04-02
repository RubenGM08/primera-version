package Unidad7.Actividad7_11R.Controller;

import Unidad7.Actividad7_11R.Clases.Lista;

public class Main {
    public static void main(String[] args) {
        Lista lista=new Lista();
        lista.insertarPrincipio(50);
        lista.insertarPrincipio(60);
        lista.insertarUltimo(100);
        lista.mostrarElementos();
        Lista listado=new Lista();
        listado.insertarPrincipio(1);
        listado.insertarUltimo(2);
        listado.insertarUltimo(3);
        listado.insertarUltimo(4);
        listado.insertarUltimo(5);
        listado.insertarUltimo(6);
        listado.insertarUltimo(7);
        listado.insertrConIndice(4,10);
        listado.mostrarElementos();


    }
}
