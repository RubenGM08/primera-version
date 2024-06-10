window.onload=function () {
    let parrafo=document.querySelector(".parrafo");
    console.log(typeof (parrafo)); //muestrame que es parrafo
    llamarParrafo(parrafo);
    objetos();
    viaje();
    vehiculos();
}

function llamarParrafo(parrafo) {
    parrafo.innerHTML="Es una prueba";
    let matriz=[4,32,3,4,5,3]; //Declarando un objeto tipo array
    let miArray=new Array(5); //declarando un objetor array con 5 elementos.
    console.log(miArray);
    miArray.push("Juan"); //agrega al final
    miArray.unshift("Pedro"); //añade en el principio del array
    console.log(miArray);
    console.log(miArray.length); //le aplico el metodo lenght para conocer la lonngitud
    console.log(typeof (document.querySelector("#imagen")));
    //instruccion que permite verificar si el objeto es una instancia de una clase
    console.log(miArray instanceof Array); //true porque miArray es de la Clase Array
    console.log(miArray instanceof Map); //false porque no es una instancia de un Mapa
}

function objetos(){
    //Objeto objeto
    let notas=new Object();
    notas.valores=[7,8,6,5,4,10,8];
    notas.cantidad=notas.valores.length;
    notas.materia="Matematicas"; //al objeto se le puede crear metodos y atributos..como en java
    /**
     * alumno=new Alumno(nombre,apellido,dni)
     * alumno.getNombre --> y te devuelve nombre
     */
    console.log(notas.cantidad);
    console.log(notas.valores);
    notas.media=0;
    for (let i= 0; i < notas.valores.length; i++){
        notas.media+=notas.valores[i];
    }
    notas.media/=notas.cantidad;
    console.log(notas.media.toFixed(2))
    console.log(notas.materia);
}

function viaje() {
    //declaramos el objeto viaje y la funcion mostrar
    let viajeN={//objeto viaje
        origen:"Granada", //sus atributos
        destino:"El Cairo",
        dias:8,
        precio:1000,
        mostrar:function (){
            console.log(`${viajeN.origen} / ${viajeN.destino}`);
            console.log(`Durante ${viajeN.dias} dias, con un precio de ${viajeN.precio}€`)
        }
    }
    viajeN.mostrar();

}

function vehiculos() {
    otroVehiculo=new Vehiculo("Citroen","C4", "Rojo", "110CV");
    otroVehiculo.mostrar();
}

