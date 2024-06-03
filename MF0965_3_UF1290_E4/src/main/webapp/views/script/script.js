window.onload = function() {
    document.getElementById('crear').addEventListener('click', function() {
        let fruta = document.getElementById('fruta').value.toLowerCase();
        let numero = document.getElementById('numero').value;
        let frase = document.getElementById('frase').value;
        let contrasena = '';

        // Mapeo de frutas a símbolos
        switch (fruta) {
            case "naranja":
                fruta = "(❁´◡`❁)";
                break;
            case "platano":
                fruta = "(●'◡'●)";
                break;
            case "banana":
                fruta = "(^///^)";
                break;
            case "uva":
                fruta = "U_U";
                break;
            case "manzana":
                fruta = "╰(*°▽°*)╯";
                break;
            case "sandia":
                fruta = "☆*:.｡.o";
                break;
            case "melon":
                fruta = "o.｡.:*☆";
                break;
            case "mandarina":
                fruta = "(*/ω＼*)";
                break;
            case "pera":
                fruta = "^_^";
                break;
            case "melocoton":
                fruta = "ᓚᘏᗢ";
                break;
            case "kiwi":
                fruta = "(┬┬﹏┬┬)";
                break;
            case "fresa":
                fruta = "ಥ_ಥ";
                break;
            default:
                fruta = "(-_-)";
                break;
        }

        // Mapeo de números a símbolos
        switch (numero) {
            case 0:
                numero = "⁛5";
                break;
            case 1:
                numero = "⁜4";
                break;
            case 2:
                numero = "※2";
                break;
            case 3:
                numero = "⁂-12";
                break;
            case 4:
                numero = "‱0";
                break;
            case 5:
                numero = "℃2";
                break;
            case 6:
                numero = "©51";
                break;
            case 7:
                numero = "‥41";
                break;
            case 8:
                numero = "⁖22";
                break;
            case 9:
                numero = "⁙";
                break;
            case 10:
                numero = "⁚`‼1";
                break;
            default:
                numero = "⁕2";
                break;
        }


        // Eliminar espacios y modificar la frase
        let baseContrasena = fruta + numero + frase;

        // Función para aleatorizar una cadena
        function mezclarCadena(cadena) {
            let arreglo = cadena.split('');
            for (let i = arreglo.length - 1; i > 0; i--) {
                const j = Math.floor(Math.random() * (i + 1));
                [arreglo[i], arreglo[j]] = [arreglo[j], arreglo[i]];
            }
            return arreglo.join('');
        }

        // Generar la contraseña mezclada
        contrasena = mezclarCadena(baseContrasena);

        // Mostrar la contraseña en el campo correspondiente
        document.getElementById('contraseña').value = contrasena;
    });

    // Añadir event listener para el botón de copiar
    document.getElementById('copiar').addEventListener('click', function() {
        copiarContenido();
    });
}

// Función para copiar la contraseña generada al portapapeles
function copiarContenido() {
    let texto = document.getElementById('contraseña').value;
    console.log("La contraseña a copiar es " + texto);
    navigator.clipboard.writeText(texto).then(function() {
        alert('Contraseña copiada al portapapeles');
    }, function(err) {
        console.error('Error al copiar: ', err);
    });
}