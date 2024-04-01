/*
Clase Persona, que se crea con sus atributos o caracteristicas(variables) y sus metodos o comportamientos(funciones)
 */
package Unidad7.Explicacion.Clases;

public class Persona {
    public String nombre;
    public byte edad;
    public double estatura;
    public double peso;
    public String dni;
    public boolean extranjero;
    public static String hoy;
    //Método Constructor: crear una instancia de una clase mediante el paso de valores
    //Métodos constructores puede ser sobrecargados???-> se pueden crear varios con el mismo
    //nombre y lo que los diferencia es el paso de valores o atributos

    public Persona(){
        //vacio
    }
    public Persona(String nombre){
        this.nombre=nombre;
    }

    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Persona(String nombre, byte edad, double estatura, double peso, String dni, boolean extranjero) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
        this.dni = dni;
        this.extranjero = extranjero;
    }

    //Métodos o comportamentos

    public  void cumplirAnio(){
        int contador;
        System.out.println("Feliz Cumpleaños "+this.nombre);
        System.out.println("Tu edad ahora es " + (this.edad
                +1) + " años");

    }
    public void saludar(){
        System.out.println("Hola, mi nombre es " + nombre);
    }
    public void crecer(double incremento){
        estatura+=incremento;//reemplazamos el dato inicial de estatura
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        if (edad>0)
            this.edad = edad;

    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public boolean isExtranjero() {
        return extranjero;
    }

    public void setExtranjero(boolean extranjero) {
        this.extranjero = extranjero;
    }

    public static String getHoy() {
        return hoy;
    }

    public static void setHoy(String hoy) {
        Persona.hoy = hoy;
    }
}