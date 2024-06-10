
class Vehiculo {
    marca;
    modelo;
    color;
    potencia;


    constructor(marca, modelo, color, potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.potencia = potencia;
    }

    mostrar(){
        console.log(`Coche Marca ${this.marca} con el modelo ${this.modelo} 
        y es de color ${this.color} con la potencia ${this.potencia}`)
    }
}
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
let miCoche=new Vehiculo("Ford","Kuga","Gris","110CV");
miCoche.mostrar();
miCocheNuevo=new Coche("Audi", "A4", "Blanco", "150CV", "Alta", 4);
miCocheNuevo.mostrar();
miMoto=new Moto("BMW","XXfh1","Negro", "120CV", 10, 5);
miMoto.mostrar();

//recorridos de Objetos

for(dato in miCoche){
    console.log(`${dato} : ${miCoche[dato]}`);
}

for(dato of Object.getOwnPropertyNames(miCoche)){
    console.log(dato);
}

for (dato in miCocheNuevo){
    console.log(`miCocheNuevo ${dato} : ${miCocheNuevo[dato]}`)
}

for (dato in miMoto){
    console.log(`miMoto ${dato} : ${miMoto[dato]}`)
}
//Borrar un dato de un objeto creado
delete miCoche.potencia;
//mostramos nuevamente miVehiculo y comprobamos que ha borrado la potencia.
for (dato in miCoche){
    console.log(`${dato} : ${miCoche[dato]}`)
}
