package Unidad7.Actividad_IVA_ENUM.Clases;

public class Producto {
    private String nombre;
    private double precioBase;
    TipoIva iva;

    public Producto(String nombre, double precioBase, TipoIva iva) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.iva = iva;
    }

    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public TipoIva getIva() {
        return iva;
    }

    public void setIva(TipoIva iva) {
        this.iva = iva;
    }

    public double calcularIVA(double base, double porcentaje){
        double totalMasIva=(base*(porcentaje/100))+base;
        return totalMasIva;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precioBase=" + precioBase +
                ", iva=" + iva.getPorcentaje() +
                '}';
    }
}
