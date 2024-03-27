package Unidad7.Actividad7_6R.Controlador;

import Unidad7.Actividad7_6R.Clases.Hora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Hora h = new Hora();
        System.out.println("Hora: ");
        byte valor = sc.nextByte();
        h.setHora(valor);
        System.out.println("Minutos: ");
        valor = sc.nextByte();
        h.setMinuto(valor);
        System.out.println("Segundos: ");
        valor = sc.nextByte();
        h.setSegundos(valor);
        System.out.println("Cuantos segundos quieres incrementar: ");
        byte numerosSegundos= sc.nextByte();
        for (int i = 0; i <= numerosSegundos; i++) {
            System.out.println(h.getHora() + ":" + h.getMinuto() + ":" + h.getSegundos());
            h.incrementaSegundo();
        }
    }
}
