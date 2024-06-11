//creamos una solicitud de XHtppsRequest = solicitud al protocolo https del navegador
const xmlhttp=new XMLHttpRequest();

//Definir una funcion que se va a ejecutar cuando se complete la solicitud que hemos definido
xmlhttp.onload=function () {
    //Para leer un Json y convertilo en un objeto se utiliza la expresion JSON.parse(archivo, variable..ll)
    const myObj=JSON.parse(this.responseText); //lo que trae de respuesta es llamada http
    //Inicializando kas variables que se van a mostrar en el HTML
    let texto="";
    let pet="";

    //Interar con los datos del objeto sobre las propiedades JSON
    for (const elem in myObj){
        if (elem==="pets"){
            //si la propiedad es pets interamos con el array mascotas
            for (const p of myObj[elem]){
                pet+=`Animal: ${p.animal} - Nombre: ${p.name} <br>`
            }
        }else {
            //De lo contrario, agrega el texto de las propiedades principales
            texto+=`${elem.toUpperCase()} : ${myObj[elem]} <br>`
        }
    }
    //Muestra el contenido HTML
    document.querySelector(".salida").innerHTML=texto+pet;
}
//Configurar la solicitud para obtener el archivo JSON
xmlhttp.open("GET", "views/files/archivo.json");

//enviar la solicitud
xmlhttp.send();




