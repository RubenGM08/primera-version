package Unidad5;
/*
 * Insertar 10 nombre y numeros de telefonos y luego mostralos
 */

import java.util.Scanner;

public class NombreTelefono {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[]nombre=new String[3];
        int[] telefono=new int[10];
        for (int i=0; i< nombre.length;i++){
            mostrarSinLn("Indica el Nombre Nº" + (i+1)+" ");
            nombre[i]= sc.next();sc.nextLine();
            mostrarSinLn("Indica el Telefono Nº" + (i+1)+" ");
            telefono[i]= sc.nextInt();
        }
        /*Mostrar los Nombres y números insertados*/
        for (int i = 0; i < nombre.length; i++) {
            mostrar("Lista de teléfonos");
            mostrar("Nombre\tTeléfono");
            mostrar(nombre[i]+ "\t"+telefono[i]);
            mostrar("-----------------------------");
        }
        mostrar("¿Quieres buscar un nombre y te indique el numero?");
        String nombreBuscar= sc.next();sc.nextLine();
        //envio el nombre la funcion buscar nombre y recibo el indice donde esta ubicado, luego
        //muestro el número del indice recibido
        int indiceNumero=buscarTexto(nombre,nombreBuscar);
        if (indiceNumero<nombre.length){
            mostrar("**** E N C O N T R A D O ****");
            mostrar(nombre[indiceNumero] + "Telefóno: " + telefono[indiceNumero]);
        } else {
            mostrar("No se encuentra " + nombreBuscar + " en la tabla actual.");
        }

        mostrar("¿Quieres cabiar algún número telefónico? De quien es -> ");
        nombreBuscar= sc.next();sc.nextLine();
        indiceNumero=buscarTexto(nombre,nombreBuscar);
        if (indiceNumero< nombre.length){
            mostrar("Indica el nuevo número de teléfono");
            telefono[indiceNumero]=sc.nextInt();
        }


    }

    public static void mostrar(String texto) {
        System.out.print("\n"+texto);
    }

    public static void mostrarSinLn(String texto) {
        System.out.print("\t"+texto);
    }

    public static int buscarTexto(String[] texto, String buscar) {
        int indice=0;
        while (indice< texto.length && !texto[indice].equals(buscar)){
            indice++;
        }
        return indice;

    }

}
