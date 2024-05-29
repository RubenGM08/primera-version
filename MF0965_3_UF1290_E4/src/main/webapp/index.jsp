<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="views/css/style.css">
    <link rel="stylesheet" href="views/css/responsive.css">
    <link rel="icon" href="views/img/castle-2218358_640-Photoroom.png-Photoroom.png">
    <script src="views/script/script.js"></script>
    <title>🔐🔑Contraseña Segura😎</title>
</head>
<body>
    <div class="col-12">
        <div class="col-9 caja simple-linear texto-centrado">
            <div class="col-12">
            <h1 class="rojo padding">Vamos a crear una Contraseña Segura</h1>
            </div>
            <div class="col-11">
                <label for="fruta" class="col-3">Fruta Favorita:</label>
                <input type="text" id="fruta" name="fruta" class="col-2">
                <label for="numero">Numero Favorito:</label>
                <input type="number" id="numero" name="numero" class="col-1">
                <label for="añoNacimiento">Año de Nacimiento:</label>
                <input type="number" id="añoNacimiento" name="añoNacimiento" class="col-1">
                <button id="crear" class="col-1 azul">Crear Contraseña</button>
            </div>
            <p class="col-12">
                <label for="contraseña" class="col-3">Contraseña:</label>
                <input type="text" id="contraseña" name="contraseña" class="col-3">
                <button class="icono sin-fondo" id="copiar">📋</button>
            </p>
            <div class="col-12">
                <h1 class="rojo padding">Verificalo en <a href="https://password.kaspersky.com/">kaspersky.com/</a></h1>
            </div>
        </div>
    </div>
</body>
</html>