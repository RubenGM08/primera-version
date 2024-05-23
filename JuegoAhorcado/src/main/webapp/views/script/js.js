window.onload=function () {
    let palabra=['azul','amarillo','rojo','rosa','verde','turquesa','morado','malva','blanco','negro','marron','naranja','violeta','lila','beige'];
    let palabraSelecionada=palabra[selecionarPalabra()].toUpperCase();
    console.log(palabraSelecionada)
    crearBotones();
    let palabraAdivinar=palabraSelecionada.split(""); //se crea un array de letras de la palabra a adivinar
    console.log(palabraAdivinar.length); //conocemos cuantas letras tiene la palabra
    crearCuadros(palabraAdivinar.length);
    comprobarLetraUser(palabraSelecionada);



}

function selecionarPalabra() {
    let indiceSelecionado=parseInt(Math.random()*14);
    return indiceSelecionado;
}

function crearBotones() {
    let divLetras= document.getElementById("divLetras");
    let letras='qwertyuiopasdfghjklñzxcvbnm'.split('');
    letras.forEach(function (letra, indece){
        if (indece==10 || indece==20){
            let salto=document.createElement("br");
            divLetras.appendChild(salto);
        }
        var boton = document.createElement("button");
        boton.textContent=letra.toUpperCase();
        boton.value=letra.toUpperCase();
        boton.classList.add("boton");
        boton.classList.add("boton-letra");
        divLetras.appendChild(boton);
    });
}

function crearCuadros(longitud) {
    console.log(longitud);
    let letrasAdivinar=document.querySelector(".letras");
    for (let i = 0; i < longitud; i++) {
        letrasAdivinar.classList.add("letras");
        let unaLetra=document.createElement("span");
        //Agregar atributo id con el valor i
        unaLetra.setAttribute("id",String(i))
        /**/
        unaLetra.classList.add("cuadros")
        letrasAdivinar.appendChild(unaLetra);

    }
}

function comprobarLetraUser(palabra) {
    /**/
    let contadorUserC=0;
    let contadorUser=6;
    let cuadorsLetras=document.querySelectorAll(".cuadros");
    /**/
    let letraUser=document.querySelectorAll(".boton-letra");
    let ahorcado=document.querySelector(".ahorcado");
    letraUser.forEach(function (elemento) {
        elemento.addEventListener("click",function () {
            correcta=false;
            console.log(elemento.value);
            console.log(palabra);
            for (let i = 0; i < palabra.length; i++) {
                if (palabra[i]==elemento.value){
                    console.log(i)
                    correcta=true;
                    cuadorsLetras[i].innerHTML=elemento.value;
                    /*Bloquear y colorear el teclado con las letras selecionadas por el usuario*/
                    elemento.classList.backgroundColor="green";
                    elemento.disabled=true;
                    /*Comprobar que el usuario adivino la palabra*/
                    ++contadorUserC;
                    if (contadorUserC==palabra.length || contadorUser==0){
                        letraUser.forEach(function (e){
                            e.disabled=true;
                        })
                        ganador();
                        mostrarBotonesPartida();
                    }
                }
            }
            if (correcta){
                elemento.style.backgroundColor="darkgreen";
                elemento.style.color="white";
            }else {
                elemento.style.backgroundColor="darkred";
                elemento.style.color="white";
                contadorUser--;
                ahorcado.src="views/img/"+contadorUser+".png";
                if (contadorUser==0){
                    letraUser.forEach(function (e){
                        e.disabled=true;
                    })
                    mostrarBotonesPartida();
                }
            }
            document.querySelector(".contador").innerHTML=`Te quedan ${contadorUser} intentos`;
        })
    });
}

function mostrarBotonesPartida() {
    let partida=document.querySelector(".nuevaP");
    let salir=document.querySelector(".salir");
    partida.style.visibility="visible";
    salir.style.visibility="visible";
    partida.addEventListener("click",function (){
       window.location.reload();
    });
    salir.addEventListener("click",function (){
        window.close();
    })

}