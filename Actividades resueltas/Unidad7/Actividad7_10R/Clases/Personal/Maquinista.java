package Unidad7.Actividad7_10R.Clases.Personal;

public class Maquinista {
    private String nombre;
    private String dni;
    private double sueldo;
    private String rando;

    public Maquinista(String nombre, String dni, double sueldo, String rando) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
        this.rando = rando;
    }

    public Maquinista() {
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

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getRando() {
        return rando;
    }

    public void setRando(String rando) {
        this.rando = rando;
    }

    @Override
    public String toString() {
        return "Maquinista{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", sueldo=" + sueldo +
                ", rando='" + rando + '\'' +
                '}';
    }
}
