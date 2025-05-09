<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Registrar Cliente</title></head>
<body>
    <h2>Registrar Nuevo Cliente</h2>
    <form action="ClienteControl" method="post">
        <input type="hidden" name="accion" value="registrar">
        Nombres: <input type="text" name="nombres"><br>
        DNI: <input type="text" name="dni"><br>
        Dirección: <input type="text" name="direccion"><br>
        Celular: <input type="text" name="celular"><br>
        Sexo: 
        <select name="sexo">
            <option value="M">Masculino</option>
            <option value="F">Femenino</option>
        </select><br>
        Fecha Nacimiento: <input type="date" name="fecha"><br>
        <input type="submit" value="Registrar">
    </form>
</body>
</html>
