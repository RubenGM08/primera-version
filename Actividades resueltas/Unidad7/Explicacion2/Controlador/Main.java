package Unidad7.Explicacion2.Controlador;

import Unidad7.Explicacion2.Clases.Alumno;
import Unidad7.Explicacion2.Clases.Curso;

public class Main {
    public static void main(String[] args) {
        Curso curso=new Curso("Programacion","AT1","IRINA");

        Alumno alumno= new Alumno("Ruben",(byte) 25,"123456789","C.Fasdadsfa", curso);

        System.out.println(alumno.toString());


    }
}
