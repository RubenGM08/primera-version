package Unidad4;

import java.util.Scanner;

public class PedirDatos {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String nombre;
        String apellido;
        byte edad;
        System.out.println("Indique el Nombre ->");
        nombre= sc.nextLine();
        System.out.println("Indique el Apellido");
        apellido= sc.nextLine();
        System.out.println("Edad: ");
        edad= sc.nextByte();
        incrementoEdad(nombre,apellido,edad);
        quitarEdad(nombre,apellido,edad);
    }

    public static void incrementoEdad(String nom, String ape, byte ed) {
        ed+=10;
        System.out.println(nom + " " + ape + " " + "tendra dentro de 10 años " + ed + " años!");

    }public static void quitarEdad(String nombreUsuario, String apellidoUsuario, byte edadUsuario) { //Ambito local
        edadUsuario-=10;
        System.out.println(nombreUsuario + " " + apellidoUsuario + " " + "tenias hace 10 años " + edadUsuario + " años!");
        for (int i=1; i<=edadUsuario; i++){
            System.out.println(nombreUsuario+ " " + apellidoUsuario + " " + i);
        }
    }
}
