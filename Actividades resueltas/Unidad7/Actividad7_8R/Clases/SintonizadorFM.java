package Unidad7.Actividad7_8R.Clases;


/**
 * Tema 7
 * Actividad Resuelta 7.8
 * Definir una clase que permita controlar un sintonizador digital de emisoras FM; concretamente,
 * se desea dotar al controlador de una interfaz que permita subir (up) o bajar (down)
 * la frecuencia (en saltos de 0,5 MHz) y mostrar la frecuencia sintonizada en un momento
 * dado (display). Supondremos que el rango de frecuencias para manejar oscila entre los
 * 80 MHz y los 108 MHz y que, al inicio, el controlador sintonice la frecuencia indicada en
 * el constructor o 80 MHz por defecto. Si durante una operación de subida o bajada se
 * sobrepasa uno de los dos límites, la frecuencia sintonizada debe pasar a ser la del extremo
 * contrario. Escribir un pequeño programa principal para probar su funcionamiento.
 */

public class SintonizadorFM {
    double frecuencia;
    double favorita;

    /**
     * Método Constructor
     */

    public SintonizadorFM(double frecuencia){
        //Hay que validar que la frecuencia este comprendida entre 80 y 108 con saltos de 0.5 Mhz
        if (frecuencia<80){
            this.frecuencia=80;
        }else if (frecuencia>108){
            this.frecuencia=108;
        } else {
            this.frecuencia=frecuencia;
        }
    }

    public SintonizadorFM() {//si no se le pasa la frecuencia inicial, comenzamos en 80
        this.frecuencia=80;
    }

    //subir de frecuencia (up)
    public double up(){
        this.frecuencia+=0.5;
        //Comprobar que esa frecuencia esta dentro de los limites -> metodo comprobador
        comprobarFrecuencia();
        return this.frecuencia;
    }

    //bajar de frecuencia (down)
    public double down(){
        this.frecuencia-=0.5;
        //Comprobar que esa frecuencia esta dentro de los limites -> metodo comprobador
        comprobarFrecuencia();
        return this.frecuencia;
    }

    public void comprobarFrecuencia(){
        //trabajamos directamente con el atributo de la clase -> this.frecuencia
        if (this.frecuencia<80){
            this.frecuencia=108;
        } else if (this.frecuencia>108) {
            this.frecuencia=80;

        }

    }

    //Mostrar que frecuencia esta sincronizado
    public void display(){
        System.out.println("Sincronizando -> " + this.frecuencia + " Mhz");
    }

    //Agregar una frecuencia favorita


    public double getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(double frecuencia) {
        this.frecuencia = frecuencia;
    }
}
