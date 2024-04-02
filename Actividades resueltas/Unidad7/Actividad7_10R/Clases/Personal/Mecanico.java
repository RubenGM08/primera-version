package Unidad7.Actividad7_10R.Clases.Personal;

public class Mecanico {

    private String nombre;
    private String tlf;
    private Especialidad especialidad;

    public Mecanico(String nombre, String tlf, Especialidad especialidad) {
        this.nombre = nombre;
        this.tlf = tlf;
        this.especialidad = especialidad;
    }

    public Mecanico() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Mecanico{" +
                "nombre='" + nombre + '\'' +
                ", tlf='" + tlf + '\'' +
                ", especialidad=" + especialidad +
                '}';
    }

}
