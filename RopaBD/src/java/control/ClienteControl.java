package control;

import dao.ClienteDAO;
import modelo.Cliente;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

public class ClienteControl extends HttpServlet {
    private final ClienteDAO clienteDAO = new ClienteDAO();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion = request.getParameter("accion");

        if ("registrar".equals(accion)) {
            Cliente c = new Cliente();
            c.setNombres(request.getParameter("nombres"));
            c.setDni(request.getParameter("dni"));
            c.setDireccion(request.getParameter("direccion"));
            c.setCelular(request.getParameter("celular"));
            c.setSexo(request.getParameter("sexo"));
            c.setFechaNacimiento(Date.valueOf(request.getParameter("fecha")));
            c.setIdPublicista(1); 
            clienteDAO.registrar(c);
            response.sendRedirect("listaClientes.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Cliente> lista = clienteDAO.listar();
        request.setAttribute("lista", lista);
        request.getRequestDispatcher("listaClientes.jsp").forward(request, response);
    }
}
