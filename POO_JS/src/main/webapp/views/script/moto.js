class Moto extends Vehiculo{
    cilindrada;
    posturaConduccion;


    constructor(marca, modelo, color, potencia, cilindrada, posturaConduccion) {
        super(marca, modelo, color, potencia);
        this.cilindrada = cilindrada;
        this.posturaConduccion = posturaConduccion;
    }

    mostrar() {
        super.mostrar();
        console.log(`Tiene una Cilindrada de ${this.cilindrada} y tiene ${this.posturaConduccion} posturas de conduccion`)
    }


}