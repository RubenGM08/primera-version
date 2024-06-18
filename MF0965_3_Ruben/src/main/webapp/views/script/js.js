window.onload=function () {
    let form=document.querySelector('#formGuarderia')
    form.nombreAlum.addEventListener('input',validarnombreAlum);
    form.apellidosAlum.addEventListener('input',validarapellidosAlum);
    form.nacimientoAlum.addEventListener('input',validarnacimientoAlum);
    form.direccionAlum.addEventListener('input',validarDireccionAlum);
    form.poblacionAlum.addEventListener('input',validarpoblacionAlum);
    form.codigoPostalAlum.addEventListener('input',validarCodigoPostalAlum);
    form.nyaPadre.addEventListener('input',validarnyaPadre);
    form.DNIPadre.addEventListener('input',validarDNIPadre);
    form.telefonoPadre.addEventListener('input',validarTelefonoPadre);
    form.emailPadre.addEventListener('input',validarEmailPadre);
    form.nyaMadre.addEventListener('input',validarnyaMadre);
    form.DNIMadre.addEventListener('input',validarDNIMadre);
    form.telefonoMadre.addEventListener('input',validarTelefonoMadre);
    form.emailMadre.addEventListener('input',validarEmailMadre);




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

    let submitButton = document.querySelector("#submit");
    submitButton.addEventListener('click', function(event) {
        event.preventDefault(); // Evita el envío del formulario para validar primero
        if (validarFormulario()) {
            alert("Formulario enviado");
            form.submit(); // Enviar el formulario si es válido
        } else {
            alert("Formulario incompleto");
        }
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
        nombreAlum.classList.add('validarInput');
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
        msnError.textContent = 'Los apellidos son obligatorio.';
        return false;
    } else if (!/^[a-zA-ZáéíóúÁÉÍÓÚñÑ\s]+$/.test(apellidosAlum.value.trim())) {//solo letra y espacios
        apellidosAlum.classList.add('errorInput');
        apellidosAlum.classList.remove('validarInput');
        msnError.textContent = 'El nombre solo puede contener letras y espacios.';
        return false;
    } else {//esta bien, y la ponemos en verde
        apellidosAlum.classList.remove('errorInput');
        apellidosAlum.classList.add('validarInput');
        msnError.textContent = '';
        return true;
    }
}

function validarnacimientoAlum() {
    let nacimientoAlum = document.querySelector('#nacimientoAlum');
    let msnError = document.querySelector('.nacimientoAlumError');
    let fechaNacimiento = new Date(nacimientoAlum.value);
    let hoy = new Date();
    let edad = hoy.getFullYear() - fechaNacimiento.getFullYear();
    let mes = hoy.getMonth() - fechaNacimiento.getMonth();

    // Ajustar la edad si el mes actual es menor que el mes de nacimiento
    // o si el mes es igual y el día actual es menor que el día de nacimiento
    if (mes < 0 || (mes === 0 && hoy.getDate() < fechaNacimiento.getDate())) {
        edad--;
    }

    if (!nacimientoAlum.value.trim()) {
        nacimientoAlum.classList.add("errorInput");
        nacimientoAlum.classList.remove('validarInput');
        msnError.textContent = 'La fecha de nacimiento es obligatoria.';
        return false;
    } else if (edad < 1 || edad > 6) {
        nacimientoAlum.classList.add('errorInput');
        nacimientoAlum.classList.remove('validarInput');
        msnError.textContent = 'El alumno debe tener entre 1 y 6 años.';
        return false;
    } else {
        nacimientoAlum.classList.remove('errorInput');
        nacimientoAlum.classList.add('validarInput');
        msnError.textContent = '';
        return true;
    }
}

function validarDireccionAlum() {
    let direccionAlum = document.querySelector('#direccionAlum');
    let msnError = document.querySelector('.direccionAlumError');

    if (!direccionAlum.value.trim()) {//validamos que no este vacio el nombre
        direccionAlum.classList.add("errorInput");
        direccionAlum.classList.remove('validarInput');
        msnError.textContent = 'La direccion es obligatorio.';
        return false;
    } else {//esta bien, y la ponemos en verde
        direccionAlum.classList.remove('errorInput');
        direccionAlum.classList.add('validarInput');
        msnError.textContent = '';
        return true;
    }
}

function validarpoblacionAlum() {
    let poblacionAlum = document.querySelector('#poblacionAlum');
    let msnError = document.querySelector('.poblacionAlumError');

    if (!poblacionAlum.value.trim()) {//validamos que no este vacio el nombre
        poblacionAlum.classList.add("errorInput");
        poblacionAlum.classList.remove('validarInput');
        msnError.textContent = 'La poblacion es obligatorio.';
        return false;
    } else if (!/^[a-zA-ZáéíóúÁÉÍÓÚñÑ\s]+$/.test(poblacionAlum.value.trim())) {//solo letra y espacios
        poblacionAlum.classList.add('errorInput');
        poblacionAlum.classList.remove('validarInput');
        poblacionAlum.textContent = 'La poblacion solo puede contener letras y espacios.';
        return false;
    } else {//esta bien, y la ponemos en verde
        poblacionAlum.classList.remove('errorInput');
        poblacionAlum.classList.add('validarInput');
        msnError.textContent = '';
        return true;
    }
}

function validarCodigoPostalAlum() {
    let codigoPostalAlum = document.querySelector('#codigoPostalAlum');
    let msnError = document.querySelector('.codigoPostalAlumError');

    if (!codigoPostalAlum.value.trim()) {
        codigoPostalAlum.classList.add("errorInput");
        codigoPostalAlum.classList.remove('validarInput');
        msnError.textContent = 'El código postal es obligatorio.';
        return false;
    } else if (!/^\d{5}$/.test(codigoPostalAlum.value.trim())) {
        codigoPostalAlum.classList.add('errorInput');
        codigoPostalAlum.classList.remove('validarInput');
        msnError.textContent = 'El código postal debe tener 5 dígitos.';
        return false;
    } else {
        codigoPostalAlum.classList.remove('errorInput');
        codigoPostalAlum.classList.add('validarInput');
        msnError.textContent = '';
        return true;
    }
}


function validarnyaPadre() {
    let nyaPadre = document.querySelector('#nyaPadre');
    let msnError = document.querySelector('.nyaPadreError');

    if (!nyaPadre.value.trim()) {//validamos que no este vacio el nombre
        nyaPadre.classList.add("errorInput");
        nyaPadre.classList.remove('validarInput');
        msnError.textContent = 'el nombre y los apellidos del PADRE o TUTOR1 son obligatorio.';
        return false;
    } else if (!/^[a-zA-ZáéíóúÁÉÍÓÚñÑ\s]+$/.test(nyaPadre.value.trim())) {//solo letra y espacios
        nyaPadre.classList.add('errorInput');
        nyaPadre.classList.remove('validarInput');
        msnError.textContent = 'El nombre solo puede contener letras y espacios.';
        return false;
    } else {//esta bien, y la ponemos en verde
        nyaPadre.classList.remove('errorInput');
        nyaPadre.classList.add('validarInput');
        msnError.textContent = '';
        return true;
    }
}

function validarDNIPadre() {
    let DNIPadre = document.querySelector('#DNIPadre');
    let msnError = document.querySelector('.DNIPadreError');

    if (!DNIPadre.value.trim()) {
        DNIPadre.classList.add("errorInput");
        DNIPadre.classList.remove('validarInput');
        msnError.textContent = 'El DNI es obligatorio.';
        return false;
    } else if (!/^\d{8}[A-Z]$/.test(DNIPadre.value.trim())) {
        DNIPadre.classList.add('errorInput');
        DNIPadre.classList.remove('validarInput');
        msnError.textContent = 'El DNI debe tener 8 dígitos seguidos de una letra.';
        return false;
    } else if (!validarLetraDNI(DNIPadre.value.trim())) {
        DNIPadre.classList.add('errorInput');
        DNIPadre.classList.remove('validarInput');
        msnError.textContent = 'La letra del DNI no es correcta.';
        return false;
    } else {
        DNIPadre.classList.remove('errorInput');
        DNIPadre.classList.add('validarInput');
        msnError.textContent = '';
        return true;
    }
}

function validarTelefonoPadre() {
    let telefonoPadre = document.querySelector('#telefonoPadre');
    let msnError = document.querySelector('.telefonoPadreError');

    if (!telefonoPadre.value.trim()) {
        telefonoPadre.classList.add("errorInput");
        telefonoPadre.classList.remove('validarInput');
        msnError.textContent = 'El teléfono es obligatorio.';
        return false;
    } else if (!/^\d{9}$/.test(telefonoPadre.value.trim())) {
        telefonoPadre.classList.add('errorInput');
        telefonoPadre.classList.remove('validarInput');
        msnError.textContent = 'El teléfono debe tener 9 dígitos.';
        return false;
    } else {
        telefonoPadre.classList.remove('errorInput');
        telefonoPadre.classList.add('validarInput');
        msnError.textContent = '';
        return true;
    }
}

function validarEmailPadre() {
    let emailPadre = document.querySelector('#emailPadre');
    let msnError = document.querySelector('.emailPadreError');

    if (!emailPadre.value.trim()) {
        emailPadre.classList.add("errorInput");
        emailPadre.classList.remove('validarInput');
        msnError.textContent = 'El correo electrónico es obligatorio.';
        return false;
    } else if (!/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(emailPadre.value.trim())) {
        emailPadre.classList.add('errorInput');
        emailPadre.classList.remove('validarInput');
        msnError.textContent = 'El formato del correo electrónico no es válido.';
        return false;
    } else {
        emailPadre.classList.remove('errorInput');
        emailPadre.classList.add('validarInput');
        msnError.textContent = '';
        return true;
    }
}

function validarnyaMadre() {
    let nyaMadre = document.querySelector('#nyaMadre');
    let msnError = document.querySelector('.nyaMadreError');

    if (!nyaMadre.value.trim()) {//validamos que no este vacio el nombre
        nyaMadre.classList.add("errorInput");
        nyaMadre.classList.remove('validarInput');
        msnError.textContent = 'el nombre y los apellidos del PADRE o TUTOR1 son obligatorio.';
        return false;
    } else if (!/^[a-zA-ZáéíóúÁÉÍÓÚñÑ\s]+$/.test(nyaMadre.value.trim())) {//solo letra y espacios
        nyaMadre.classList.add('errorInput');
        nyaMadre.classList.remove('validarInput');
        msnError.textContent = 'El nombre solo puede contener letras y espacios.';
        return false;
    } else {//esta bien, y la ponemos en verde
        nyaMadre.classList.remove('errorInput');
        nyaMadre.classList.add('validarInput');
        msnError.textContent = '';
        return true;
    }
}

function validarDNIMadre() {
    let DNIMadre = document.querySelector('#DNIMadre');
    let msnError = document.querySelector('.DNIMadreError');

    if (!DNIMadre.value.trim()) {
        DNIMadre.classList.add("errorInput");
        DNIMadre.classList.remove('validarInput');
        msnError.textContent = 'El DNI es obligatorio.';
        return false;
    } else if (!/^\d{8}[A-Z]$/.test(DNIMadre.value.trim())) {
        DNIMadre.classList.add('errorInput');
        DNIMadre.classList.remove('validarInput');
        msnError.textContent = 'El DNI debe tener 8 dígitos seguidos de una letra.';
        return false;
    } else if (!validarLetraDNI(DNIMadre.value.trim())) {
        DNIMadre.classList.add('errorInput');
        DNIMadre.classList.remove('validarInput');
        msnError.textContent = 'La letra del DNI no es correcta.';
        return false;
    } else {
        DNIMadre.classList.remove('errorInput');
        DNIMadre.classList.add('validarInput');
        msnError.textContent = '';
        return true;
    }
}

function validarTelefonoMadre() {
    let telefonoMadre = document.querySelector('#telefonoMadre');
    let msnError = document.querySelector('.telefonoMadreError');

    if (!telefonoMadre.value.trim()) {
        telefonoMadre.classList.add("errorInput");
        telefonoMadre.classList.remove('validarInput');
        msnError.textContent = 'El teléfono es obligatorio.';
        return false;
    } else if (!/^\d{9}$/.test(telefonoMadre.value.trim())) {
        telefonoMadre.classList.add('errorInput');
        telefonoMadre.classList.remove('validarInput');
        msnError.textContent = 'El teléfono debe tener 9 dígitos.';
        return false;
    } else {
        telefonoMadre.classList.remove('errorInput');
        telefonoMadre.classList.add('validarInput');
        msnError.textContent = '';
        return true;
    }
}

function validarEmailMadre() {
    let emailMadre = document.querySelector('#emailMadre');
    let msnError = document.querySelector('.emailMadreError');

    if (!emailMadre.value.trim()) {
        emailMadre.classList.add("errorInput");
        emailMadre.classList.remove('validarInput');
        msnError.textContent = 'El correo electrónico es obligatorio.';
        return false;
    } else if (!/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(emailMadre.value.trim())) {
        emailMadre.classList.add('errorInput');
        emailMadre.classList.remove('validarInput');
        msnError.textContent = 'El formato del correo electrónico no es válido.';
        return false;
    } else {
        emailMadre.classList.remove('errorInput');
        emailMadre.classList.add('validarInput');
        msnError.textContent = '';
        return true;
    }
}

function validarLetraDNI(dni) {
    const letras = 'TRWAGMYFPDXBNJZSQVHLCKE';
    const numero = dni.substr(0, dni.length - 1);
    const letra = dni.substr(dni.length - 1, 1).toUpperCase();
    const letraCalculada = letras.charAt(numero % 23);
    return letra === letraCalculada;
}

function validarFormulario() {
    return validarnombreAlum() && validarapellidosAlum() && validarnacimientoAlum() && validarDireccionAlum() && validarPoblacionAlum() && validarCodigoPostalAlum() && validarDNIPadre() && validarDNIMadre() && validarTelefonoPadre() && validarTelefonoMadre() && validarEmailPadre() && validarEmailMadre();
}