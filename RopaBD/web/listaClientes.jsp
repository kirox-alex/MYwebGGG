<%@ page import="java.util.*, modelo.Cliente" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Lista de Clientes</title></head>
<body>
    <h2>Clientes Registrados</h2>
    <table border="1">
        <tr>
            <th>ID</th><th>Nombre</th><th>DNI</th><th>Dirección</th><th>Celular</th><th>Sexo</th><th>Acción</th>
        </tr>
        <c:forEach var="cliente" items="${lista}">
            <tr>
                <td>${cliente.id}</td>
                <td>${cliente.nombres}</td>
                <td>${cliente.dni}</td>
                <td>${cliente.direccion}</td>
                <td>${cliente.celular}</td>
                <td>${cliente.sexo}</td>
                <td>
                    <a href="ClienteControl?accion=editar&id=${cliente.id}">Editar</a> |
                    <a href="ClienteControl?accion=eliminar&id=${cliente.id}">Eliminar</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
