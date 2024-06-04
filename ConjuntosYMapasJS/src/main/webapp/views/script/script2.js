window.onload=function () {

    /**
     *
     * @type {Set<any>}
     */

    //buscar en un conjunto
    let conjunto=new Set().add(1).add(2).add(11);
    console.log(conjunto);
    //buscar elemento dentro del conjunto
    if (conjunto.has(11)){
        console.log("Encontrado")
    }else {
        console.log("No encontrado")
    }
    //eliminar un valor
    conjunto.delete(2);
    console.log(conjunto)
    //elimina todos
    conjunto.clear();
    console.log(conjunto)
    //Convertir el conjunto en un array
    let array=[conjunto];
    console.log(array)

    //unir arrays en un conjunto
    let array1=[1,2,3,4,5];
    let array2=[6,7,8,9,10];
    let array3=[1,11,9,12,7];
    let numeros=new Set();
    //se agrega cada array recogiendolo e agregando cada valor al conjunto, de esta manera
    //se garantiza que no haya duplicados.
    for (let i = 0; i < array1.length; i++) {
        numeros.add(array1[i])
    }

    for (let i = 0; i < array2.length; i++) {
        numeros.add(array2[i])
    }

    for (let i = 0; i < array3.length; i++) {
        numeros.add(array3[i])
    }

    console.log(numeros)


    /**
     * Creacion de la Agenda con Mapas
     */

    let agenda=new Map();
    let boton=document.querySelector(".boton");
    let tabla=document.querySelector("#tabla");

    boton.addEventListener("click", function () {
        let nombre=document.querySelector("#nombre").value;
        let telefono=document.querySelector("#telefono").value;
        if (/^[a-zA-ZáéíóúÁÉÍÓÚñÑ\s]+$/.test(nombre.trim()) && telefono.match(/^\d{9}$/)) {
            //como en los aarays agregar era push, en los conjuntos es add, y en los mapas es set
            // let longitud=agenda.size;
            // agenda.set(nombre,telefono)
            // if (agenda.size==(longitud+1)){
            //     mostrarAgenda(nombre,telefono);
            //}
            //OTRA FORMA, MAS EFECTIVA DE COMPROBAR SI SE REALIZA LA INSERCION EN EL MAP
            if (!agenda.has(nombre)){
                agenda.set(nombre,telefono);
                mostrarAgenda(nombre,telefono);
            }
        } else {
            document.querySelector(".error").textContent="Los datos de nombre y telefono son obligatorios";
        }
        console.log(agenda)

    })

}

function mostrarAgenda(nombre,telefono) {
    let tabla=document.querySelector("#tabla");

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

    document.querySelector("#nombre").value="";
    document.querySelector("#telefono").value="";
}