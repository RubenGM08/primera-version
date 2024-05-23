<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Juego del ahorcado 🕹️🎮</title>
    <script src="views/script/js.js"></script>
    <script src="views/script/ganador.js"></script>
    <link rel="stylesheet" href="views/css/responsive.css">
    <link rel="stylesheet" href="views/css/style.css">
    <link rel="icon" href="views/img/js.png">
</head>
<body class="contenedor">
    <div class="centrado">
        <h1>Adivina la Palabra</h1>
        <div class="letras">
            <%--se insertan los input necesarios para adivinr la palabra--%>


        </div>
        <img src="views/img/6.png" alt="muñequito" class="ahorcado">
    </div>
    <div id="divLetras" class="centrado">

    </div>
    <div class="contador centrado">
    </div>
    <div class="centrado">
        <button class="nuevaP">Nueva Partida</button>
        <button class="salir">Salir del Juego</button>
    </div>
</body>
</html>