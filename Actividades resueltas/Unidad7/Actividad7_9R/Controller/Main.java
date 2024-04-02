package Unidad7.Actividad7_9R.Controller;

/**
 * Tema 7
 * Actividad Resuelta 7.9
 * Modelar una casa con muchas bombillas, de forma que cada bombilla se pueda enceder
 * o apagar individualmente. Para ello, hacer una clase Bombilla con una variable privada
 * que indique si está encendida o apagada, así como un método que nos difa el estado de
 * una bombilla concreta. Además, queremos poner un interruptor general, de forma que si
 * este se apaga,todas ñas bombillas quedan apagadas. Cuando el interruptor general se
 * activa, las bombullas quedan apagadas,segýn estuvieran antes. Cada
 * bombilla se encienda y se apaga individualmente, peros solo responde que está encendida
 * si su interruptor está activadp y además hoy luz general
 */

import Unidad7.Actividad7_9R.Clases.Bombilla;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        Bombilla salon=new Bombilla();
        Bombilla cocina=new Bombilla();
        Bombilla hab1=new Bombilla();
        Bombilla banio=new Bombilla();
        int opcion;
        do {
            System.out.println("\nMenú de Interruptores de la CASA");
            System.out.println("1. Salon " + salon.mostraEstador());
            System.out.println("2. Cocina " + cocina.mostraEstador());
            System.out.println("3. Habitación " + hab1.mostraEstador());
            System.out.println("4. Baño " + banio.mostraEstador());
            System.out.println("5. Interruptor General " + Bombilla.interruptorGenral);
            System.out.println("6. Salir");
            System.out.print("Indica tu opcion-> ");
            opcion= sc.nextInt();

            switch (opcion){
                case 1->{
                    if (salon.estado()){
                        salon.apagar();
                    }else {
                        salon.encender();
                    }
                }
                case 2->{
                    if (cocina.estado()){
                        cocina.apagar();
                    }else {
                        cocina.encender();
                    }
                }
                case 3->{
                    if (hab1.estado()){
                        hab1.apagar();
                    }else {
                        hab1.encender();
                    }
                }
                case 4->{
                    if (banio.estado()){
                        banio.apagar();
                    }else {
                        banio.encender();
                    }
                }
                case 5->
                    Bombilla.interruptorGenral= !Bombilla.interruptorGenral;

                case 6->
                    System.out.println("Adios...........");

                default ->
                    System.out.println("Opcion no valida");



            }

        }while (opcion!=6);

    }
}
