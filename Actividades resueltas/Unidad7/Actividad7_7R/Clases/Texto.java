package Unidad7.Actividad7_7R.Clases;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Tema 7
 * Actividad Resuelta 7.7
 * Diseñar la clase Texto que gestiona una cadena de caracteres con algunas características:
 *     -La cadena de caracteres tendrá una longitud máxima que se especifica en el cons-tructor
 * <p>
 *     -Permite añadir un carácter al principio o al final, siempre y cuando no se exceda la
 *      longitud máxima, es decir, exista espacio disponibl
 * <p>
 *     -Igualmente, permite añadir una cadena, al principio o al final del texto, siempre y
 *      cuando no se rebase el tamaño máximo establecido
 * <p>
 *     -Es necesario saber cuántas vocales (mayúsculas y minúsculas) hay en el texto
 * <p>
 *     -Cada objeto de tipo Texto tiene que conocer la fecha en la que se creó, así como la
 *      fecha y hora de la última modificación efectuada
 * <p>
 *     -Deberá existir un método que muestre la información que gestiona cada texto.
 */

public class Texto {
    private final int LONGITUDMAX;
    private String cadena;
    LocalDate fechaCreacion;
    LocalTime horaModificacion;

    static final String VOCALES="aeiouáéíóú";

    public Texto(int longitud){
        //creamos la cadena
        cadena=""; //la inicializamos como vacia
        this.LONGITUDMAX =longitud;
        //guardamos la fecha de creacion
        fechaCreacion=LocalDate.now();
        horaModificacion=null; //no se ha modificado nada
    }

    //Añadir un caracter al dinal de la cadena
    public void addFinal(char c){
        if (this.LONGITUDMAX >cadena.length()){ //valida que tenga espacio segun la longitud
            cadena+=c;//agregamos la letra al final de la cadena
            horaModificacion=LocalTime.now();//se actualiza la hora de midificacion
        }
    }
    //Añadir al principio de la cadena
    public void addPrincipio(char c){
        if (LONGITUDMAX >cadena.length()){
            cadena=cadena+c;
            horaModificacion=LocalTime.now();
        }
    }

    //Agregar al final una cadena
    public void addCadenaFinal(String cadAgregar){
        if (LONGITUDMAX >(cadAgregar.length()+cadena.length())){
            cadena=cadAgregar+cadena;
            horaModificacion=LocalTime.now();
        }
    }

    //Agregar cadena de principio
    public void addCandaPrincipio(String cadAgregar){
        if (LONGITUDMAX >(cadAgregar.length()+cadena.length())){
            cadena=cadAgregar+cadena;
            horaModificacion=LocalTime.now();
        }
    }

    //Hay que contar las vocales que hay en la cadena
    public int contarVocales(){
        int contador=0;
        for (int i = 0; i < cadena.length(); i++) {
            if (esVocal(cadena.charAt(i))){ //enviamos a comparar al metodo esVocal si la letra esta en la cadena VOCALES
            contador++;
            }
        }
        return contador;
    }

    private boolean esVocal(char c){
        boolean vocal=false;
        c=Character.toLowerCase(c);//para pasarlo a minuscula
        if (VOCALES.indexOf(c)!=-1){//esto indica que si existe la coincidencia de la letra en la cadena vocales
            vocal=true;
        }
        return vocal;
    }

    @Override
    public String toString() {
        return "Texto{" +
                "longitudMax=" + LONGITUDMAX +
                ", cadena='" + cadena + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", horaModificacion=" + horaModificacion +
                '}';
    }
}
