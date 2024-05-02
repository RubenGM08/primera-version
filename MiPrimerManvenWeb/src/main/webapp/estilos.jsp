<%--
  Created by IntelliJ IDEA.
  User: irina
  Date: 30/4/24
  Time: 19:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="header.jsp"></jsp:include>
<!doctype html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta name="viewport"
        content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Css Hoja de Estilo</title>
  <link rel="stylesheet" href="Views/css/style.css">
  <link rel="stylesheet"
        href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@24,400,0,0"/>
</head>
<body>
<!--Plantilla-->
<header class="col-12">

  <h1>Header</h1>

</header>

<section class="contenedorHijos col-10">
  <div class="col-6"><h1>Hijo 1</h1></div>
  <div class="col-6"><h1>Hijo 2</h1></div>
</section>

<section class="contenedorHijos col-10">
  <div class="col-12"><h1>Hijo 1</h1></div>
</section>

<footer class="col-12">
  <h1>Footer</h1>
</footer>







</body>
</html>