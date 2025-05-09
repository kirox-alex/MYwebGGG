package control;

import dao.PublicidadDAO;
import modelo.Publicidad;
import modelo.EnvioPublicidad;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.Timestamp;

public class PublicidadControl extends HttpServlet {
    private final PublicidadDAO publicidadDAO = new PublicidadDAO();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion = request.getParameter("accion");

        if ("registrar".equals(accion)) {
            Publicidad p = new Publicidad();
            p.setTipoProducto(request.getParameter("tipoProducto"));
            p.setDescripcion(request.getParameter("descripcion"));
            p.setNumeroContacto(request.getParameter("numeroContacto"));
            p.setImagenUrl(request.getParameter("imagenUrl"));
            publicidadDAO.registrar(p);
            response.sendRedirect("menuPrincipal.jsp");
        }

        if ("asignar".equals(accion)) {
            EnvioPublicidad envio = new EnvioPublicidad();
            envio.setIdCliente(Integer.parseInt(request.getParameter("idCliente")));
            envio.setIdPublicidad(Integer.parseInt(request.getParameter("idPublicidad")));
            envio.setMedio(request.getParameter("medio"));
            envio.setFechaEnvio(new Timestamp(System.currentTimeMillis()));
            publicidadDAO.asignarPublicidad(envio);
            response.sendRedirect("menuPrincipal.jsp");
        }
    }
}
