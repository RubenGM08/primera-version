package Unidad4;

import java.util.Scanner;

public class FuncionesReturn {
    public static void main(String[] args) {

        String nombreUsuario=llamadaNombre(3);
        System.out.println("Tu nombre es -> " + nombreUsuario);
    }


    public static String llamadaNombre(int contador) {
        String nombre="";
        System.out.println("Indica el nombre-> ");
        Scanner sc = new Scanner(System.in);
        nombre=sc.nextLine();
        return nombre; //envia a quien invoca la funcion el valor de nombre


    }



}
