package Unidad9.Actividad9_4R.Controller;

import Unidad9.Actividad9_4R.Modell.Lista;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lista d=new Lista();
        d.encolar(1);//utilizamos la interace cola implementada en Lista
        d.encolar(2);
        d.encolar(3);
        d.encolar(4);
        d.encolar(5);
        d.encolar(6);
        d.encolar(7);
        System.out.println(d);
        d.desencolar();
        System.out.println(d.numeroElementos()); //la clase Lista
        System.out.println(d);
        Lista x = new Lista();
        System.out.print("Introducir número: ");
        Integer n = new Scanner(System.in).nextInt();
        while (n >= 0) {
            x.encolar(n);
            System.out.print("Introducir número: ");
            n = new Scanner(System.in).nextInt();
        }
        n = x.desencolar();
        System.out.println("Desencolando");
        while (n != null) { //la cola vacía devuelve null al desencolar
            System.out.print(n + " ");
            n = x.desencolar();
        }
        System.out.println("");
    }
}