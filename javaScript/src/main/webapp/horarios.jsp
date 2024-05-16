<%--
  Created by IntelliJ IDEA.
  User: PROGRAMACION
  Date: 15/05/2024
  Time: 21:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="views/css/responsive.css">
    <link rel="stylesheet" href="views/css/style.css">
    <script src="views/script/horarios.js"></script>
</head>
<body>
<div class="contenedor1 col-6">
    <div class="col-6">
        <button class="l boton"value="l">L</button>
        <button class="m boton"value="m">M</button>
        <button class="x boton"value="x">X</button>
        <button class="j boton"value="j">J</button>
        <button class="v boton"value="v">V</button>
        <button class="s boton"value="s">S</button>
        <button class="d boton"value="d">D</button>
    </div>
    <div class="cajaflex col-6">
        <p class="horario centrado col-12"></p>
    </div>
</div>
</body>
</html>