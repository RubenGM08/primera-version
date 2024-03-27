package Unidad7.Explicacion2.Clases;

public class Alumno {
    String nombre;
    byte edad;
    String tlf;
    String direcion;
    Curso curso;

    public Alumno(String nombre, byte edad, String tlf, String direcion, Curso curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.tlf = tlf;
        this.direcion = direcion;
        this.curso = curso;
    }

    public Alumno() {
    }

    //Metodos Getter -> leer el dato
    //Metod Setter-> asignar

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
        this.edad = edad;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public String getDirecion() {
        return direcion;
    }

    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }


    //Metodo toString-> Genera todo el metodo de una clase


    @Override
    public String toString() {
        return "Alumno{" +
                "\nNombre Alumno='" + nombre + '\'' +
                "\nEdad del Alumno=" + edad +
                "\nTelefono del Alumno='" + tlf + '\'' +
                "\nDirecion='" + direcion + '\'' +
                curso.toString();
    }
}
