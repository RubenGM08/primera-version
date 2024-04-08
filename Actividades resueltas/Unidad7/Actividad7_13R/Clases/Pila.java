package Unidad7.Actividad7_13R.Clases;

import Unidad7.Actividad7_13R.Clases.Lista;

public class Pila {
    private Lista lista;

    //metodo constructor

    public Pila(){
        lista=new Lista(); //se crea el array solo en el momento de llamar el constructor
    }

    /**
     * Método para apilar
     * @param elemento
     */
    public void apilar(Integer elemento){
        lista.insertarPrincipio(elemento);
    }

    /**
     * Método desapilar, que elimina siempre el es
     */
    public void desapilar(){
        lista.eliminarIndice(0);
    }

    /**
     * Método que invoca el metodo mostrar de la clase Lista
     */

    public void mostrar(){
        lista.mostrarElementos();
    }
}
