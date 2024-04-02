package Unidad7.Actividad7_10R.Clases.Personal;

import java.time.LocalDateTime;

public class Jefe_de_Estacion {

    private String nombre;
    private String dni;
    LocalDateTime fechaNombramiento;

    public Jefe_de_Estacion(String nombre, String dni, LocalDateTime fechaNombramiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNombramiento = fechaNombramiento;
    }

    public Jefe_de_Estacion() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDateTime getFechaNombramiento() {
        return fechaNombramiento;
    }

    public void setFechaNombramiento(LocalDateTime fechaNombramiento) {
        this.fechaNombramiento = fechaNombramiento;
    }

    @Override
    public String toString() {
        return "Jefe_de_Estacion{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", fechaNombramiento=" + fechaNombramiento +
                '}';
    }
}
