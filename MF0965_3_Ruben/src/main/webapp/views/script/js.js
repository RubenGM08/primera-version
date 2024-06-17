window.onload=function () {
    let form=document.querySelector('#formGuarderia')
    form.nombreAlum.addEventListener('input',validarnombreAlum);
    form.apellidosAlum.addEventListener('input',validarapellidosAlum);
    form.nacimientoAlum.addEventListener('input',validarnacimientoAlum);






    let reset=document.querySelector("#reset");
    reset.addEventListener('click',function () {
        let inputs=document.querySelectorAll('input');
        inputs.forEach(function (input) {
            input.classList.remove('errorInput');
            input.classList.remove('validarInput');
        });
        let mensajeError=document.querySelectorAll(".msm")
        mensajeError.forEach(function (mensaje) {
            mensaje.textContent="";

        });
    });













}

function validarnombreAlum() {
    let nombreAlum = document.querySelector('#nombreAlum');
    let msnError = document.querySelector('.nombreAlumError');

    if (!nombreAlum.value.trim()) {//validamos que no este vacio el nombre
        nombreAlum.classList.add("errorInput");
        nombreAlum.classList.remove('validarInput');
        msnError.textContent = 'El nombre es obligatorio.';
        return false;
    } else if (!/^[a-zA-ZáéíóúÁÉÍÓÚñÑ\s]+$/.test(nombreAlum.value.trim())) {//solo letra y espacios
        nombreAlum.classList.add('errorInput');
        nombreAlum.classList.remove('validarInput');
        msnError.textContent = 'El nombre solo puede contener letras y espacios.';
        return false;
    } else {//esta bien, y la ponemos en verde
        nombreAlum.classList.remove('errorInput');
        nombreAlum.classList.add('nombreAlumError');
        msnError.textContent = '';
        return true;
    }
}

function validarapellidosAlum() {
    let apellidosAlum = document.querySelector('#apellidosAlum');
    let msnError = document.querySelector('.apellidosAlumError');

    if (!apellidosAlum.value.trim()) {//validamos que no este vacio el nombre
        apellidosAlum.classList.add("errorInput");
        apellidosAlum.classList.remove('validarInput');
        msnError.textContent = 'El nombre es obligatorio.';
        return false;
    } else if (!/^[a-zA-ZáéíóúÁÉÍÓÚñÑ\s]+$/.test(apellidosAlum.value.trim())) {//solo letra y espacios
        apellidosAlum.classList.add('errorInput');
        apellidosAlum.classList.remove('validarInput');
        msnError.textContent = 'El nombre solo puede contener letras y espacios.';
        return false;
    } else {//esta bien, y la ponemos en verde
        apellidosAlum.classList.remove('errorInput');
        apellidosAlum.classList.add('apellidosAlumError');
        msnError.textContent = '';
        return true;
    }
}

function validarnacimientoAlum() {

}



function validarFomulario() {
    if (validarnombreAlum() && validarapellidosAlum() && validarnacimientoAlum())
        return true;
    else
        return false;
}





