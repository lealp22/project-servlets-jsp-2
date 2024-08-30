<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Formulario desde JSP</title>
    <h1>Formulario desde JSP</h1>
</head>
<body>
<h2>Introduce tu nombre</h2>
<form action="myServlet2" method="POST">
    Nombre: <input type="text" name="nombre"><br>
    <input type="submit" value="Enviar">
</form>
</body>
</html>
