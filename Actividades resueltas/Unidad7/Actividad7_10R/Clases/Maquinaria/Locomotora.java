package Unidad7.Actividad7_10R.Clases.Maquinaria;

import Unidad7.Actividad7_10R.Clases.Personal.Mecanico;

public class Locomotora {

    private String matricula;
    private int potencia;
    private int anioFabricacion;
    Mecanico mecanicoAsignado;//Dentro de la clase locomotora,
    // se crea una instancia de la clase Mecánica

    /**
     * Metodo Constructor
     * @param matricula
     * @param potencia
     * @param anioFabricacion
     * @param mecanico
     */
    public Locomotora(String matricula, int potencia, int anioFabricacion, Mecanico mecanico) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.anioFabricacion = anioFabricacion;
        this.mecanicoAsignado = mecanico;
    }

    /**
     * Metodo constructor de matricula
     * @param matricula
     */
    public Locomotora(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Metodo constructor vacio
     */
    public Locomotora() {
    }

    /**
     *
     * @return
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     *
     * @param matricula
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     *
     * @return
     */
    public int getPotencia() {
        return potencia;
    }

    /**
     *
     * @param potencia
     */
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    /**
     *
     * @return
     */
    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    /**
     *
     * @param anioFabricacion
     */
    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    /**
     *
     * @return
     */
    public Mecanico getMecanicoAsignado() {
        return mecanicoAsignado;
    }

    /**
     *
     * @param mecanicoAsignado
     */
    public void setMecanicoAsignado(Mecanico mecanicoAsignado) {
        this.mecanicoAsignado = mecanicoAsignado;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Locomotora{" +
                "matricula='" + matricula + '\'' +
                ", potencia=" + potencia +
                ", anioFabricacion=" + anioFabricacion +
                ", mecanico=" + mecanicoAsignado +
                '}';
    }
}
