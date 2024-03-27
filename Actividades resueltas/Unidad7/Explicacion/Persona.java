/*
Clase Persona, que se crea con sus atributos o caracteristicas(variables) y sus metodos o comportamientos(funciones)
 */
package Unidad7.Explicacion;

public class Persona {
    String nombre;
    byte edad=0;
    double estatura=0;
    double peso=0;
    String dni= null;

    //Metodos o comportamientos

    public void cumpilAñio(){
        System.out.println("Feliz cumpleaños " + nombre);
        System.out.println("Tu edad ahora es " + (edad + 1));
    }
    public void saludar(){
        System.out.println("Hola mi nombre es-> " + nombre);
    }
    public void crecer(double incremento){
        estatura+=incremento;//reemplazando el dato inicial de estatura
    }
}
