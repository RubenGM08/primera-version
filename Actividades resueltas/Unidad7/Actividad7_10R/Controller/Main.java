package Unidad7.Actividad7_10R.Controller;

import Unidad7.Actividad7_10R.Clases.Maquinaria.Locomotora;
import Unidad7.Actividad7_10R.Clases.Maquinaria.Tren;
import Unidad7.Actividad7_10R.Clases.Maquinaria.Vagon;
import Unidad7.Actividad7_10R.Clases.Personal.Especialidad;
import Unidad7.Actividad7_10R.Clases.Personal.Jefe_de_Estacion;
import Unidad7.Actividad7_10R.Clases.Personal.Maquinista;
import Unidad7.Actividad7_10R.Clases.Personal.Mecanico;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Tema 7
 * Actividad Resuelta 7.10
 *
 */

public class Main {
    public static void main(String[] args) {
        Mecanico mecanico=new Mecanico("José","987654321", Especialidad.MOTOR);
        Jefe_de_Estacion jefedeestacion= new Jefe_de_Estacion("Manuel","012345678L", LocalDateTime.now());
        Maquinista maquinista=new Maquinista("Pedro","098765432Ñ",2500.00,"Junior");
        System.out.println("Mostramos nuestro personal");
        System.out.println(mecanico);
        System.out.println(jefedeestacion);
        System.out.println(maquinista);

        //Creams nuestras Maquinarias
        Locomotora locomotora=new Locomotora("ASDF12",15000,2010,mecanico);
        Vagon vagon=new Vagon(15,1500,200,"SHEIN");
        Tren tren=new Tren(locomotora,maquinista);
        tren.engancharVagon(1800,500,"AMAZON");
        tren.engancharVagon(vagon);
        System.out.println("****Mostramos nuestra Maquinaria****");
        System.out.println(locomotora);
        System.out.println(vagon);
        System.out.println(tren);

        //Colecciones-> Agrupar un serie de datos tipo ARRAY pero con mas facilidades

        ArrayList<Mecanico> losMecanicos=new ArrayList<>();
        Mecanico m2=new Mecanico("Luis", "926515555",Especialidad.HIDROULICAS);
        losMecanicos.add(mecanico);
        losMecanicos.add(m2);
        System.out.println(losMecanicos);

    }
}
