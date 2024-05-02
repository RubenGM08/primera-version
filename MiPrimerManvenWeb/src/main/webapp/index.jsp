
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="header.jsp"></jsp:include>

<!doctype html>
<!-- DocType: le indica al navegador el tipo de documento a mostrar -->
<html lang="es"> <!-- lan="es" estamos indicando que la página es en español -->
<head> <!--Encabezado del documento, la mayoria de los metas no se muestran -->
    <meta charset="UTF-8"> <!-- charset es el tipo de caracteres aceptados  -->
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta name="author" content="Irina Medina">
    <meta name="keyworks" content="Html,jsp,Java">
    <title>Mi primer JSP con HTML</title> <!-- Se considera obligatorio poner un title a cada página-->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@24,400,0,0" />
    <link rel="stylesheet" href="Views/css/style.css">
</head>
<body>

        <!--Encabezados / Titulos -->

<h1>Encabezado H1</h1>
<h2>Encabezado H2</h2>
<h3>Encabezado H3</h3>
<h4>Encabezado H4</h4>
<h5>Encabezado H5</h5>
<h6>Encabezado H6</h6>

<p>
    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Atque beatae dolor ducimus expedita, impedit ipsam modi molestias obcaecati odio officia recusandae rerum? Corporis error eveniet laboriosam rem rerum sit velit.
    <br>
    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Accusantium aliquid, at corporis distinctio dolore dolorem impedit laudantium maxime minima, molestiae obcaecati officiis porro possimus praesentium qui repellat tempora, vitae voluptates?
    <br>

    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Blanditiis earum est hic illo iste mollitia necessitatibus optio suscipit. Aliquid animi commodi delectus dolores illum officiis porro quaerat qui saepe vero.
</p>
        <hr>
<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Architecto dignissimos, doloribus ea eos eveniet id, incidunt, nemo nobis repudiandae sed sequi suscipit ut voluptate? Aut commodi dolorum in ipsam quia!</p>
        <img src="Views/images/s1.jpg" alt="Poster de la pelicula Sueperman">
        <img src="Views/images/s2.jpg" alt="Traje de Superman">
    <div>
        <img src="Views/images/s3.jpg" alt="Superman">
    </div>
<div>
    <img src="Views/images/s4.jpg" alt="Man of Steel">
</div>
        <video src="Views/videos/trailer-super.mp4" autoplay muted controls  loop   ></video>
        <iframe width="560" height="315" src="https://www.youtube.com/embed/CwaiO_-m978?si=T2LO3j9FpZ9ErMMW" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3093.535059742564!2d-3.0253458237817146!3d39.16255533101483!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xd68fc7bfd00cb7b%3A0x47cf731534dbcfd8!2sC.%20Campo%2C%2081%2C%2013700%20Tomelloso%2C%20Ciudad%20Real!5e0!3m2!1ses!2ses!4v1713975068246!5m2!1ses!2ses" width="600" height="450" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
        <hr>
<h1>Audio</h1>
        <audio src="Views/audio/banda-sonora.ogg" controls muted autoplay></audio>

<h1> Enlaces</h1>
        <a href="listasytablas.jsp">Ir a Listas y tablas </a>
</body>
</html>