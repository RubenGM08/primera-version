window.onload=function (){

    /**
    * Conjuntos en JavaScript no permiten duplicados, en caso de existir los ingnora
     * @type {Set<string>}
     */

    // let conjunto=new Set(["uno","dos","tres"]);
    // let nombres=new Set("Irene", "Florin", "Rubén", "Isabel");
    // //Recorreido con for(item of array);
    // for (numero of conjunto){
    //     console.log(numero);
    // }
    // for (nombre of nombres){
    //     console.log(nombre)
    // }

    let boton=document.querySelector(".boton");
    let agenda=new Set([""]);
    let tabla=document.querySelector("#tabla");
    boton.addEventListener("click",function () {
        let nombre=document.querySelector("#nombre").value;
        let telefono=document.querySelector("#telefono").value;
        if (/^[a-zA-ZáéíóúÁÉÍÓÚñÑ\s]+$/.test(nombre.trim()) && telefono.match(/^\d{9}$/)){
            agenda.add([nombre,telefono]);
            console.log(agenda);
            //Agregar ese contacto a la tabla
            let fila=document.createElement("tr");
            //Crea una fila en la tabla
            tabla.appendChild(fila);
            //diseña y crea la celda de nombre del contacto
            let columna1=document.createElement("td");
            columna1.classList.add("columna");
            columna1.textContent=nombre;
            tabla.appendChild(columna1);

            //diseña y crea la celda de telefono del contacto
            let columna2=document.createElement("td");
            columna2.classList.add("columna");
            columna2.textContent=telefono;
            tabla.appendChild(columna2);

        } else {
            document.querySelector(".error").textContent="Los datos de nombre y telefono son obligatorios";
        }
        document.querySelector("#nombre").value="";
        document.querySelector("#telefono").value="";


    })
}