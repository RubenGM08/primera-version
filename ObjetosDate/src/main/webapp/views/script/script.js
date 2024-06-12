let fecha=new Date();
window.onload=function (){

    document.querySelector("#fechaHoy").addEventListener("click",mostrarFecha);
    document.querySelector("#diaHoy").addEventListener("click",mostrarDia);
    document.querySelector("#mesActual").addEventListener("click",mostrarMes);
    document.querySelector("#anioActual").addEventListener("click",mostrarAnio);
    document.querySelector("#fechaCompleta").addEventListener("click",mostrarFullDate);
    document.querySelector("#hora").addEventListener("click",mostrarHora);





}



function mostrarFecha() {
    document.querySelector("#salida").textContent=fecha.toLocaleDateString();
}

function mostrarDia(){
    document.querySelector("#salida").textContent="Hoy es "+fecha.getDate();
}

function mostrarMes() {
    document.querySelector("#salida").textContent="El mes "+parseInt(fecha.getMonth()+1);
}

function mostrarAnio() {
    document.querySelector("#salida").textContent="El año "+fecha.getFullYear();
}

function mostrarFullDate() {
    document.querySelector("#salida").textContent=fecha.toLocaleString('es-ES', {
        weekday: 'long',
        year: 'numeric',
        month: 'long',
        day: 'numeric'
    }).toUpperCase();
}
function mostrarHora() {
    document.querySelector("#salida").textContent=fecha.toLocaleTimeString();
}