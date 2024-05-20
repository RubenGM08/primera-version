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
</head>
<body>
<div class="contenedor1 morado">
    <label for="piedra">
        <input type="radio" value="1" name="opcion" id="piedra">
        <img src="views/img/Piedra.png" alt="Piedra" class="col-6">
    </label>
    <label for="papel">
        <input type="radio" value="2" name="opcion" id="papel">
        <img src="views/img/Papel.png" alt="Papel" class="col-6">
    </label>
    <label for="tijeras">
        <input type="radio" value="3" name="opcion" id="tijeras">
        <img src="views/img/Tijeras.png" alt="Tijeras" class="col-6">
    </label>
    <div class="maquina centrado">
        <img src="" alt="respuesta maquina" id="respuestaMaquina" class="col-6">
    </div>
    <div class="contenedor1">
        <p class="centrado" id="mensaje"></p>
        <h2 id="contador" class="centrado"></h2>

    </div>
</div>

</body>
</html>