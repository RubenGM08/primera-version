class Coche extends Vehiculo{
    gama;
    nPuertas;


    constructor(marca, modelo, color, potencia, gama, nPuertas) {
        super(marca, modelo, color, potencia);
        this.gama = gama;
        this.nPuertas = nPuertas;
    }

    mostrar() {
        super.mostrar();
        console.log(`es una gama ${this.gama} y tiene ${this.nPuertas} puertas`)
    }
}