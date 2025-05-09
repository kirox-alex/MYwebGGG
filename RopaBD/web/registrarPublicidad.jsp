<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Registrar Publicidad</title></head>
<body>
    <h2>Registrar Publicidad</h2>
    <form action="PublicidadControl" method="post">
        <input type="hidden" name="accion" value="registrar">
        Tipo de Producto: <input type="text" name="tipoProducto"><br>
        Descripción: <textarea name="descripcion"></textarea><br>
        Número de Contacto: <input type="text" name="numeroContacto"><br>
        Imagen URL: <input type="text" name="imagenUrl"><br>
        <input type="submit" value="Registrar">
    </form>
</body>
</html>
