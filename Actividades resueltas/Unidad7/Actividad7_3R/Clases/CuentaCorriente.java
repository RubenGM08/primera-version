package Unidad7.Actividad7_3R.Clases;
/**
 * Modificadores de acceso
 */

public class CuentaCorriente {
    public String nombreCliente; //publico para cualquier clase vecina o externa
    String dni;//solo visible para clase del paquete
    private double saldo;//solo visible en su propia clase

    /**
     * Método constructor
     * @param nombreCliente
     * @param dni
     */
    public CuentaCorriente(String nombreCliente, String dni) {
        this.nombreCliente = nombreCliente;
        this.dni = dni;
        this.saldo=0;
    }

    /**
     * Constructor vacio
     */
    public CuentaCorriente() {

    }

    /**
     * Constructor con todos los atributos de la clase
     * @param nombreCliente
     * @param dni
     * @param saldo
     */
    public CuentaCorriente(String nombreCliente, String dni, double saldo) {
        this.nombreCliente = nombreCliente;
        this.dni = dni;
        this.saldo = saldo;
    }

    /**
     * Método para egresar dinero en la cta. corriente y valida si hay saldo suficiente
     * @param importe
     * @return
     */
    public boolean egreso(double importe){
        boolean operacionPosible;
        if(this.saldo>=importe){
            this.saldo-=importe;
            operacionPosible=true;
        }else{
            System.out.println("Operacion no es posible...No tiene saldo");
            operacionPosible=false;
        }
        return operacionPosible;
    }

    /**
     * Método para ingresar dinero a la cta.corriente y sumarlo al saldo
     * @param ingreso
     */
    public void ingresar(double ingreso){
        this.saldo+=ingreso;
    }

    public void mostrarInfo(){
        System.out.println("Nombre del Cliente-> " + this.nombreCliente+
                "\nDNI-> " + this.dni+
                "\nSaldo Actual-> " + this.saldo);

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    /* Metodo que muestra los valores de una clase y se hace automáticamente toString()*/

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "nombreCliente='" + nombreCliente + '\'' +
                ", dni='" + dni + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}