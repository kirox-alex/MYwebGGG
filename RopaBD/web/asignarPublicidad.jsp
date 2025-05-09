<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Asignar Publicidad</title></head>
<body>
    <h2>Asignar Publicidad a Cliente</h2>
    <form action="PublicidadControl" method="post">
        <input type="hidden" name="accion" value="asignar">
        ID Cliente: <input type="text" name="idCliente"><br>
        ID Publicidad: <input type="text" name="idPublicidad"><br>
        Medio:
        <select name="medio">
            <option value="WhatsApp">WhatsApp</option>
            <option value="Correo">Correo</option>
            <option value="Red Social">Red Social</option>
        </select><br>
        <input type="submit" value="Asignar">
    </form>
</body>
</html>
