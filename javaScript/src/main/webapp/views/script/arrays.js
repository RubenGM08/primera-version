window.onload=function () { //Cuano el documento se lea, luegocomienza a ejecutarse
    crearPaises();
    let colorHex=["#f39c12","#C0F312","#12F3E5","#F312AF","#F31212"]
    crearLista(colorHex);
    cambiarColor(colorHex);
    cabiarColorFondo();

}
function crearPaises() {
    let paises=["España", "Portugal","Italia","Francia","Alemania","Belgica"];
    //lectura de un array con un for simple
    paises.sort();//metodo para ordebar un array en una lista
    //agregar al final del array a Holanda
    paises.push("Holanda");
    //agregar al principio del array a Reino Unido
    paises.unshift("Reino Unido");


    let lista=document.querySelector(".lista");
    for (let i = 0; i < paises.length; i++) {
            let li=document.createElement("li");
            li.textContent=paises[i];
            lista.appendChild(li);
    }

    let listaNueva=[1,2,3,4,5,6,7,8,9];
    console.log(listaNueva)
    //eliminar un elemento del principio
    listaNueva.shift();
    //eliminar un elemento al final
    listaNueva.pop();
    console.log(listaNueva)
    //eliminar por posicion y varios elementos
    listaNueva.splice(3,3)
    console.log(listaNueva)
    //añadir varios elementos al principio
    listaNueva.unshift(1,2,3,4)
    console.log(listaNueva);
    //añadir varios elementos al final
    listaNueva.push(10,11,12,13,14)
    console.log(listaNueva);
}

function crearLista(colorHex) {
    let listaColores=document.querySelector("#colores");
    for (let i = 0; i < colorHex.length; i++) {
        let option=document.createElement("option");
        option.textContent=String(i+1);
        option.setAttribute("value",String (i+1));
        option.classList.add("colorSelecionado");
        option.style.padding="10px"
        listaColores.appendChild(option);

    }
}

function cambiarColor(colores) {
    let seleccion=document.querySelector("#colores");
    let cuadro=document.querySelector(".contenedor1")
    seleccion.addEventListener("change",function () {
        let valor=seleccion.value;
        console.log(valor)
        cuadro.style.backgroundColor=colores[valor-1];
        cuadro.style.height="400px";
    });
}

function cabiarColorFondo() {
    let input=document.querySelector("#colorFondo");
    let cuadro=document.querySelector("body")
    input.addEventListener("change",function () {
        cuadro.style.backgroundColor=input.value;
        console.log(input.value)
    });
}
