package Unidad7.Explicacion3.Clases;
//solo para explicar los enum
public class Persona {
    public String nombre;
    public byte edad;
    public String tlf;
    public String dni;
    Extranjero esExtranjero;

    public Persona(String nombre, byte edad, String tlf, String dni, Extranjero esExtranjero) {
        this.nombre = nombre;
        this.edad = edad;
        this.tlf = tlf;
        this.dni = dni;
        this.esExtranjero = esExtranjero;
    }

    public Persona() {
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
        this.edad = edad;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Extranjero getEsExtranjero() {
        return esExtranjero;
    }

    public void setEsExtranjero(Extranjero esExtranjero) {
        this.esExtranjero = esExtranjero;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", tlf='" + tlf + '\'' +
                ", dni='" + dni + '\'' +
                ", esExtranjero=" + esExtranjero +
                '}';
    }
}
