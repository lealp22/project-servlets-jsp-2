<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bienvenida con JSP</title>
</head>
<body>
<h1>Bienvenida <%= request.getAttribute("nombre") %></h1>
</body>
</html>