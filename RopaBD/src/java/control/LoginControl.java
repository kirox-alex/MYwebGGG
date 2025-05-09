package control;

import dao.UsuarioDAO;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import modelo.Usuario;

public class LoginControl extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion = request.getParameter("accion");
        UsuarioDAO dao = new UsuarioDAO();

        if ("login".equals(accion)) {
            String usuario = request.getParameter("usuario");
            String contrasena = request.getParameter("contrasena");
            Usuario u = dao.validar(usuario, contrasena);

            if (u != null) {
                HttpSession session = request.getSession();
                session.setAttribute("usuario", u);
                response.sendRedirect("menuPrincipal.jsp");
            } else {
                request.setAttribute("error", "Usuario o contraseña incorrecta.");
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }

        } else if ("registrar".equals(accion)) {
            Usuario nuevo = new Usuario();
            nuevo.setUsuario(request.getParameter("usuario"));
            nuevo.setContrasena(request.getParameter("contrasena"));
            nuevo.setNombres(request.getParameter("nombres"));

            dao.insertar(nuevo); // INSERT en BD

            // Iniciar sesión automáticamente
            HttpSession session = request.getSession();
            session.setAttribute("usuario", nuevo);
            response.sendRedirect("menuPrincipal.jsp");
        }
    }
}
