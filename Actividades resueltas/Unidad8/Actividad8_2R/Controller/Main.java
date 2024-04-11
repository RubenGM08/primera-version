package Unidad8.Actividad8_2R.Controller;

import Unidad8.Actividad8_2R.Clases.HoraExacta;

public class Main {
    public static void main(String[] args) {
        HoraExacta h1=new HoraExacta(1,1,1);
        System.out.println(h1.toString());
        HoraExacta h2=new HoraExacta(1,1,80);
        System.out.println(h2.toString());
        HoraExacta h3=new HoraExacta(1,80,80);
        System.out.println(h3.toString());
        HoraExacta h4=new HoraExacta(80,1,1);
        System.out.println(h4.toString());
        HoraExacta h5=new HoraExacta(80,1,80);
        System.out.println(h5.toString());
        HoraExacta h6=new HoraExacta(80,80,1);
        System.out.println(h6.toString());
    }
}
