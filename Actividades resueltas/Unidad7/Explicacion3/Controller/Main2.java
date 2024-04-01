package Unidad7.Explicacion3.Controller;

import Unidad7.Explicacion3.Clases.Extranjero;
import Unidad7.Explicacion3.Clases.Persona;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona p1=new Persona("Pedro",(byte) 34,"123456789","087654321L", Extranjero.valueOf("SI"));
        System.out.println(p1.toString());
        Persona p2=new Persona("Pedro",(byte) 34,"123456789","087654321L", Extranjero.NO);
        System.out.println(p2.toString());
        Persona p3=new Persona("Pedro",(byte) 34,"123456789","087654321L", Extranjero.SI);
        System.out.println(p3.toString());


        //solicitar los datos a un usuario y crear el objeto persona con esos datos
        Persona persona=new Persona();
        System.out.print("\nNombre-> ");
        String nomT= sc.next();sc.nextLine();
        persona.setNombre(nomT);
        System.out.print("Edad-> ");
        byte edadT=sc.nextByte();
        persona.setEdad(edadT);
        System.out.print("Nº Telefono-> ");
        String tlfT= sc.next();sc.nextLine();
        persona.setTlf(tlfT);
        System.out.print("DNI-> ");
        String dniT= sc.next();sc.nextLine();
        persona.setTlf(dniT);
        System.out.print("Es Extranjero: SI / NO --> ");
        String exT= sc.next();sc.nextLine();
        persona.setEsExtranjero(Extranjero.valueOf(exT));

        System.out.println(persona.toString());
    }
}
