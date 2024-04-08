package MF0964_3_EV_PRACTICA.Clases;

public class Calculadora {

    // VARIABLES DE LA CLASE
    public double num1; // Primer número para operaciones.
    public double num2; // Segundo número para operaciones.
    public double suma; // Almacena el resultado de la suma.
    public double resta; // Almacena el resultado de la resta.
    public double multiplicar; // Almacena el resultado de la multiplicación.
    public double dividir; // Almacena el resultado de la división.
    public double resto; // Almacena el resultado del resto.
    public double exponencia; // Almacena el resultado del exponente.

    // CONSTRUCTOR
    public Calculadora(double num1, double num2) {
        this.num1 = num1; // Asigna el valor de num1 al atributo num1 de la clase.
        this.num2 = num2; // Asigna el valor de num2 al atributo num2 de la clase.
    }

    /**
     * Metodo para calcular la Suma
     * @return
     */    public double calcularSuma(){
        double resultado; // Variable local para almacenar el resultado.
        resultado = num1 + num2; // Calcula la suma de los números.
        System.out.println("La suma de los dos números " + num1 + " y " + num2 + " da como resultado -> " + resultado); // Muestra el resultado.
        return resultado; // Retorna el resultado de la suma.
    }

    /**
     * Metodo para calcular la DResta
     * @return
     */    public double calcularResta(){
        double resultado; // Variable local para almacenar el resultado.
        if (num1 < num2) {
            resultado = num2 - num1; // Calcula la resta de num2 - num1 si num1 es menor que num2.
            System.out.println("La resta de los dos números " + num2 + " y " + num1 + " da como resultado -> " + resultado); // Muestra el resultado.
        } else {
            resultado = num1 - num2; // Calcula la resta de num1 - num2 si num1 es mayor o igual a num2.
            System.out.println("La resta de los dos números " + num1 + " y " + num2 + " da como resultado -> " + resultado); // Muestra el resultado.
        }
        return resultado; // Retorna el resultado de la resta.
    }

    /**
     * Metodo para calcular la Mutiplicacion
     * @return
     */
    public double calcularMultiplicacion(){
        double resultado; // Variable local para almacenar el resultado.
        if (num1 < num2) {
            resultado = num2 * num1; // Calcula la multiplicación de num2 * num1 si num1 es menor que num2.
            System.out.println("La multiplicación de los dos números " + num2 + " y " + num1 + " da como resultado -> " + resultado); // Muestra el resultado.
        } else {
            resultado = num1 * num2; // Calcula la multiplicación de num1 * num2 si num1 es mayor o igual a num2.
            System.out.println("La multiplicación de los dos números " + num1 + " y " + num2 + " da como resultado -> " + resultado); // Muestra el resultado.
        }
        return resultado; // Retorna el resultado de la multiplicación.
    }

    /**
     * Metodo para calcular la Division
     * @return
     */
    public double calcularDividion(){
        double resultado; // Variable local para almacenar el resultado.
        if (num1 < num2) {
            resultado = num2 / num1; // Calcula la división de num2 / num1 si num1 es menor que num2.
            System.out.println("La división de los dos números " + num2 + " y " + num1 + " da como resultado -> " + resultado); // Muestra el resultado.
        } else {
            resultado = num1 / num2; // Calcula la división de num1 / num2 si num1 es mayor o igual a num2.
            System.out.println("La división de los dos números " + num1 + " y " + num2 + " da como resultado -> " + resultado); // Muestra el resultado.
        }
        return resultado; // Retorna el resultado de la división.
    }

    // MÉTODO PARA CALCULAR EL RESTO
    public double calcularResto(){
        double resultado; // Variable local para almacenar el resultado.
        if (num1 < num2) {
            resultado = num2 % num1; // Calcula el resto de la división de num2 entre num1 si num1 es menor que num2.
            System.out.println("El resto de los dos números " + num2 + " y " + num1 + " da como resultado -> " + resultado); // Muestra el resultado.
        } else {
            resultado = num1 % num2; // Calcula el resto de la división de num1 entre num2 si num1 es mayor o igual a num2.
            System.out.println("El resto de los dos números " + num1 + " y " + num2 + " da como resultado -> " + resultado); // Muestra el resultado.
        }
        return resultado; // Retorna el resultado del resto.
    }

    /**
     * Metodo para calcular el Exponente
     * @return
     */
    public double calcularExponente(){
        double resultado; // Variable local para almacenar el resultado.
        if (num1 < num2) {
            resultado = Math.pow(num2, num1); // Calcula el exponente de num2 elevado a num1 si num1 es menor que num2.
            System.out.println("La exponenciación de los dos números " + num2 + " y " + num1 + " da como resultado -> " + resultado); // Muestra el resultado.
        } else {
            resultado = Math.pow(num1, num2); // Calcula el exponente de num1 elevado a num2 si num1 es mayor o igual a num2.
            System.out.println("La exponenciación de los dos números " + num1 + " y " + num2 + " da como resultado -> " + resultado); // Muestra el resultado.
        }
        return resultado; // Retorna el resultado del exponente.
    }
}
