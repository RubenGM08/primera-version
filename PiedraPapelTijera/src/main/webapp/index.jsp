<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Piedra🪨, Papel🗞️ y Tijeras✂️</title>
    <link rel="stylesheet" href="views/css/responsive.css">
    <link rel="stylesheet" href="views/css/style.css">
    <link rel="icon" href="views/img/js.png">
    <script src="views/script/script.js"></script>
    <script src="views/script/ganador.js"></script>
</head>
<body>

<div class="contenedor1  morado col-12">
    <div class="col-6 centrado">
        <label for="piedra">
            <input type="radio" value="1" name="opcion" id="piedra">
            <img src="views/img/Piedra-removebg-preview.png" alt="Piedra" class="col-2 imagenes">
        </label>
        <label for="papel">
            <input type="radio" value="2" name="opcion" id="papel">
            <img src="views/img/Papel-removebg-preview.png" alt="Papel" class="col-2 imagenes">
        </label>
        <label for="tijera">
            <input type="radio" value="3" name="opcion" id="tijera">
            <img src="views/img/Tijeras-removebg-preview.png" alt="Tijera" class="col-2 imagenes">
        </label>
    </div>
    <div class="maquina centrado col-2">
        <img src="" alt="respuesta maquina" id="respuestaMaquina"  class="col-6 imagenes">
    </div>
    <div class="contenedor2 col-4">
        <p class="centrado" id="mensaje"></p>
        <h2 id="contador" class="centrado"></h2>
        <div class="cajaFlex col-12 botones">
            <button class="boton" id="nuevaP">Iniciar nueva Partida</button>
            <button class="boton" id="salir">Salir del Juego</button>
        </div>
    </div>
</div>
<div class="marquesina col-12">
    <marquee direction="up"><img src="views/img/carita-triste.png" alt="Carita triste"></marquee>
</div>
</body>
</html>