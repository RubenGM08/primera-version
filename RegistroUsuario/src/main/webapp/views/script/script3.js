window.onload=function () {//cuando cargue la pagina, ejecuta estas lineas.
    let form = document.querySelector('#registroForm');
    form.nombre.addEventListener('input', validarNombre);
    form.apellido.addEventListener('input', validarApellido);
    form.edad.addEventListener('input', validarEdad);
    form.telefono.addEventListener('input', validarTelefono);
    form.email.addEventListener('input', validarEmail);
    form.password1.addEventListener('input', validarContrasena1)
    form.password2.addEventListener('input', validarContrasena2)
    let reset=document.querySelector("#reset")
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

    //evento "input" -> que se ha escrito dentro input, se va a la funcion validarNombre

}

function validarNombre() {
    let nombre = document.querySelector('#nombre');
    let msnError = document.querySelector('.nombreError');

    if (!nombre.value.trim()) {//validamos que no este vacio el nombre
        nombre.classList.add("errorInput");
        nombre.classList.remove('validarInput');
        msnError.textContent = 'El nombre es obligatorio.';
        return false;
    } else if (!/^[a-zA-ZáéíóúÁÉÍÓÚñÑ\s]+$/.test(nombre.value.trim())) {//solo letra y espacios
        nombre.classList.add('errorInput');
        nombre.classList.remove('validarInput');
        msnError.textContent = 'El nombre solo puede contener letras y espacios.';
        return false;
    } else {//esta bien, y la ponemos en verde
        nombre.classList.remove('errorInput');
        nombre.classList.add('validarInput');
        msnError.textContent = '';
        return true;
    }
}
function validarApellido() {
    let apellido = document.querySelector('#apellido');
    let msnError = document.querySelector('.apellidoError');

    if (!apellido.value.trim()) {//validamos que no este vacio el nombre
        apellido.classList.add("errorInput");
        apellido.classList.remove('validarInput');
        msnError.textContent = 'El apellido es obligatorio.';
        return false;
    } else if (!/^[a-zA-ZáéíóúÁÉÍÓÚñÑ\s]+$/.test(apellido.value.trim())) {//solo letra y espacios
        apellido.classList.add('errorInput');
        apellido.classList.remove('validarInput');
        msnError.textContent = 'El apellido solo puede contener letras y espacios.';
        return false;
    } else {//esta bien, y la ponemos en verde
        apellido.classList.remove('errorInput');
        apellido.classList.add('validarInput');
        msnError.textContent = '';
        return true;
    }
}

function validarEdad() {
    let edad = document.querySelector('#edad');
    let msnError = document.querySelector('.edadError');

    if (!edad.value.trim() || isNaN(edad.value)) {//validamos que no este vacio el nombre
        edad.classList.add("errorInput");
        edad.classList.remove('validarInput');
        msnError.textContent = 'La edad es obligatorio y solo números.';
        return false;
    } else if (+edad.value<=0) {//solo letra y espacios
        edad.classList.add('errorInput');
        edad.classList.remove('validarInput');
        msnError.textContent = 'La edad solo puede contener letras y espacios.';
        return false;
    } else {//esta bien, y la ponemos en verde
        edad.classList.remove('errorInput');
        edad.classList.add('validarInput');
        msnError.textContent = '';
        return true;
    }
}

function validarTelefono() {
    let telefono = document.querySelector('#telefono');
    let msnError = document.querySelector('.telefonoError');

    if (!telefono.value.trim() || isNaN(telefono.value)) {//validamos que no este vacio el nombre
        telefono.classList.add("errorInput");
        telefono.classList.remove('validarInput');
        msnError.textContent = 'El telefono es obligatorio y solo se puede poner numeros.';
        return false;
    } else if (!telefono.value.match(/^[6789]\d{8}$/)) {//solo letra y espacios
        telefono.classList.add('errorInput');
        telefono.classList.remove('validarInput');
        msnError.textContent = 'El telefono solo puede contener 8 numeros y empezar con los numero 6, 7, 8 y 9.';
        return false;
    } else {//esta bien, y la ponemos en verde
        telefono.classList.remove('errorInput');
        telefono.classList.add('validarInput');
        msnError.textContent = '';
        return true;
    }
}

function validarEmail() {
    let email = document.querySelector('#email');
    let msnError = document.querySelector('.emailError');

    if (!email.value.trim()) {//validamos que no este vacio el nombre
        email.classList.add("errorInput");
        email.classList.remove('validarInput');
        msnError.textContent = 'El correo Electronico es obligatorio';
        return false;
    } else if (!email.value.match(/^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/)) {//solo letra y espacios
        email.classList.add('errorInput');
        email.classList.remove('validarInput');
        msnError.textContent = 'El correo Electronico no es valido';
        return false;
    } else {//esta bien, y la ponemos en verde
        email.classList.remove('errorInput');
        email.classList.add('validarInput');
        msnError.textContent = '';
        return true;
    }
}

// Funciones echas por Ruben
function validarContrasena1() {
    let password1 = document.querySelector('#password1');
    let msnError = document.querySelector('.password1Error');

    if (!password1.value.trim()) {//validamos que no este vacio el nombre
        password1.classList.add("errorInput");
        password1.classList.remove('validarInput');
        msnError.textContent = 'La contraseña es obligatoria';
        return false;
    } else if (!password1.value.match(/^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}$/)) {//solo letra y espacios
        password1.classList.add('errorInput');
        password1.classList.remove('validarInput');
        msnError.textContent = 'La contraseña no cumple con una longitud mínima de 8 caracteres: al menos 1 mayúscula. 1 minúsculas, 1número';
        return false;
    } else {//esta bien, y la ponemos en verde
        password1.classList.remove('errorInput');
        password1.classList.add('validarInput');
        msnError.textContent = '';
        return true;
    }
}
function validarContrasena2() {
    let password1 = document.querySelector('#password1');
    let password2 = document.querySelector('#password2');
    let msnError = document.querySelector('.password2Error');

    if (password1.value.trim()!==password2.value.trim()) {//validamos que no este vacio el nombre
        password2.classList.add("errorInput");
        password2.classList.remove('validarInput');
        msnError.textContent = 'La contraseña es obligatoria es obligatorio y debe ser igual';
        return false;
    } else {//esta bien, y la ponemos en verde
        password2.classList.remove('errorInput');
        password2.classList.add('validarInput');
        msnError.textContent = '';
        return true;
    }
}

//Funciones echas por Irina
// function validarContrasena1() {
//     let password1 = document.querySelector('#password1');
//     let msnError = document.querySelector('.password1Error');
//     if (!password1.value.match(/^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}$/)) {//solo letra y espacios
//         password1.classList.add("errorInput");
//         password1.classList.remove("validarInput");
//         msnError.textContent = 'La contraseña debe tener una longitud minima de 8 caracteres: al menos 1 mayúscula, 1 minúscula y 1 numero'
//         return false;
//     } else {
//         password1.classList.remove("errorInput");
//         password1.classList.add("validarInput");
//         msnError.textContent = '';
//         return false
//     }
// }
//
// function validarContrasena2() {
//     let password1 = document.querySelector('#password1');
//     let password2 = document.querySelector('#password2');
//     let msnError = document.querySelector('.password2Error');
//
//     if (password1.value.trim()!==password2.value.trim()) {//validamos que no este vacio el nombre
//         password2.classList.add("errorInput");
//         password2.classList.remove('validarInput');
//         msnError.textContent = 'La contraseña es obligatorio y debe ser igual';
//         return false;
//     } else {//esta bien, y la ponemos en verde
//         password2.classList.remove('errorInput');
//         password2.classList.add('validarInput');
//         msnError.textContent = '';
//         return true;
//     }
// }

function validarFomulario() {
    if (validarNombre() && validarApellido() && validarEdad() && validarTelefono() && validarEmail() && validarContrasena1() && validarContrasena2())
        return true;
    else
        return false;
}
