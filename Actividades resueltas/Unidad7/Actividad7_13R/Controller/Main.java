package Unidad7.Actividad7_13R.Controller;

import Unidad7.Actividad7_13R.Clases.Pila;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Pila p=new Pila();
        for (int i = 0; i < 10; i++) {
            p.apilar(i);

        }
        p.mostrar();
        p.desapilar();

    }
}
