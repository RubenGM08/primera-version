package Unidad7.Actividad7_1R.Clases;

/**
 * Tema 7
 * Actividad Resuelta 7.1
 * Diseñar la clase CuentaCorriente, que almacena los datos: DNI y nombre del titular, así
 * como el saldo. Las operaciones típicas con una cuenta corriente son:
 *
 *  -Crear una cuenta: se necesita el DNI y nombre del titular. El saldo inicial será 0.
 *  -Sacar dinero: el método debe indicar si ha sido posible llevar a cabo la operación, si
 *   existe saldo suficiente.
 *  -Ingresar dinero: se incrementa el saldo
 *  -Mostrar información: muestra la información disponible de la cuenta corriente.
 *
 */
public class CuentaCorriente {
    public String nombreCliente;
    public String dni;
    double saldo;

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

    public CuentaCorriente() {
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



}