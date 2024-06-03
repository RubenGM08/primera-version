window.onload=function () {
    let array=crearArray();
    mostrarArray(array)
    practica(array)


}

function crearArray() {
    //array vacio
    let array=[];
    let aleatorio;
    //creamos un bucle para llenar el array con las condiciones que nos indican
    for (let i = 1; i <= 10; i++) {
        aleatorio=parseInt(Math.random()*21)*5;
        array.push(aleatorio);

    }

    console.log(array)
    while (array[0]<50){
        console.log("Entra al loop")
        array[0]=parseInt(Math.random()*21)*5;
    }
    console.log(array)
    while (array[9]>50){
        console.log("Entra al 2º loop")
        array[9]=parseInt(Math.random()*21)*5;
    }
    console.log(array)
    return array;
}

function mostrarArray(array) {
    let lista=document.querySelector(".lista");
    lista.style.listStyle="none"
    for (let i = 0; i < array.length; i++) {
        let item=document.createElement("li")
        item.setAttribute("style","square")
        item.textContent=array[i];
        item.style.border="1px solid black"
        item.style.padding="10px";
        lista.appendChild(item);

    }

}

function practica(array) {
    //console log busqueda
    let numero=55;
    let resultado=array.indexOf(numero);
    console.log(resultado);
    let ultimoResultado=array.lastIndexOf(numero);
    console.log(ultimoResultado);
    array.sort();

    console.log(array.reverse());



}