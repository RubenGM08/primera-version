package Unidad7.Actividad7_5R.Clases;

public class CuentaCorriente {
    public String nombreCliente; //publica para cualquier clase vecina o externa
    String dni;//solo voisble para clase del paquete
    private double saldo;//solo visible en su propia clase
    Gestor gestor;

    public CuentaCorriente(String nombreCliente, String dni, Gestor gestor) {
        this.nombreCliente = nombreCliente;
        this.dni = dni;
        this.gestor = gestor;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Gestor getGestor() {
        return gestor;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }


}
