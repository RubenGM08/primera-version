package Unidad7.Actividad7_12R.Controller;

import Unidad7.Actividad7_12R.Clases.Lista;

public class Main {

    public static void main(String[] args) {
    Lista l1=new Lista();
    l1.insertarUltimo(4);l1.insertarUltimo(6);l1.insertarUltimo(10);
    l1.insertarUltimo(45);l1.insertarUltimo(74);l1.insertarUltimo(11);
    l1.mostrarElementos();

    Lista l2=new Lista();
    l2.insertarUltimo(145);l2.insertarUltimo(174);l2.insertarUltimo(205);
    l2.insertarUltimo(14);l2.insertarUltimo(16);l2.insertarUltimo(101);
    l2.mostrarElementos();

    //Creamos una tercera lista
    Lista concatenada=new Lista();
    concatenada=concatenada.concatenarLsta(l1,l2);
    concatenada.mostrarElementos();



    }


}
