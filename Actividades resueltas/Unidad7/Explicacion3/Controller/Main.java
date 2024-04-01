package Unidad7.Explicacion3.Controller;

import Unidad7.Explicacion3.Clases.DiasDeLaSemana;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DiasDeLaSemana hoy=DiasDeLaSemana.LUNES;
        String diaHoy= String.valueOf(DiasDeLaSemana.LUNES);
        System.out.println(hoy);
        System.out.println(diaHoy);
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el dia de la Semana");
        String otroDia=sc.nextLine().toUpperCase(); //me aseguro que la entrada este igual al enum
        DiasDeLaSemana ingles= DiasDeLaSemana.valueOf(otroDia);
        System.out.println(ingles.name());//muestra el valor que se asigna al Enum;

    }
}
