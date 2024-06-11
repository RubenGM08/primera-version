class Vehiculo {
    vehiculo;
    marca;
    modelo;
    color;
    potencia;
    gama;


    constructor(vehiculo, marca, modelo, color, potencia, gama) {
        this.vehiculo = vehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.potencia = potencia;
        this.gama = gama;
    }
}

let coche1=new Vehiculo("Coche","Audi","A4","Blanco","150Cv","Alta");
let coche2=new Vehiculo("Coche","Ford","Kuga","Gris","110Cv","Media");
let coche3=new Vehiculo("Coche","Opel","Corsa","Rojo","136Cv","Alta");


let texto1=JSON.stringify(coche1);
let texto2=JSON.stringify(coche2);
let texto3=JSON.stringify(coche3);

console.log(texto1)
console.log(texto2)
console.log(texto3)


//creamos una solicitud de XHtppsRequest = solicitud al protocolo https del navegador
const xmlhttp=new XMLHttpRequest();

//Definir una funcion que se va a ejecutar cuando se complete la solicitud que hemos definido
xmlhttp.onload=function () {
    //Para leer un Json y convertilo en un objeto se utiliza la expresion JSON.parse(archivo, variable..ll)
    const myVehiculo=JSON.parse(this.responseText); //lo que trae de respuesta es llamada http
    //Inicializando kas variables que se van a mostrar en el HTML
    let texto="";
    let detalle="";

    //Interar con los datos del objeto sobre las propiedades JSON
    for (const elem in myVehiculo){
        if (elem==="detalles"){
            //si la propiedad es pets interamos con el array mascotas
            for (const p of myVehiculo[elem]){
            let fila=document.createElement("tr");
            let tabla=document.querySelector("table");
            tabla.appendChild(fila)
                let columna=document.createElement("td");
                columna.textContent=`${p.Vehiculo}`;
                fila.appendChild(columna);
                let columna1=document.createElement("td");
                columna1.textContent=`${p.marca}`;
                fila.appendChild(columna1);
                let columna2=document.createElement("td");
                columna2.textContent=`${p.modelo}`;
                fila.appendChild(columna2);
                let columna3=document.createElement("td");
                columna3.textContent=`${p.color}`;
                fila.appendChild(columna3);
                let columna4=document.createElement("td");
                columna4.textContent=`${p.potencia}`;
                fila.appendChild(columna4);
                let columna5=document.createElement("td");
                columna5.textContent=`${p.gama}`;
                fila.appendChild(columna5);

            }
        }else {
            //De lo contrario, agrega el texto de las propiedades principales
            texto+=`${elem.toUpperCase()} : ${myVehiculo[elem]} <br>`
        }
    }
}
//Configurar la solicitud para obtener el archivo JSON
xmlhttp.open("GET", "views/files/vehiculos.json");

//enviar la solicitud
xmlhttp.send();


