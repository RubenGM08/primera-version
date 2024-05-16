window.onload=function () {
    let boton=document.querySelector(".boton");
    boton.addEventListener("click",function (e) {
        let nombre=document.querySelector("#nombre").value;
        let edad=document.querySelector("#edad").value;
        let salida="";
        if (edad<=12){
            salida="niño";
        }else if (edad>=13 && edad<=17){
            salida="adolescente";
        }else if (edad>=18 && edad<=65){
            salida="trabajador";
        }else {
            salida="jubilado";
        }
        document.querySelector(".salida").innerHTML=`${nombre} tiene ${edad} y es ${salida}`;


    })




}