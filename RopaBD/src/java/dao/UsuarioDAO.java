package dao;

import conex.Conexion;
import modelo.Usuario;

import java.sql.*;

public class UsuarioDAO {

    public Usuario validar(String user, String pass) {
        Usuario u = null;
        try (Connection con = Conexion.getConexion()) {
            String sql = "SELECT * FROM usuario WHERE usuario = ? AND contrasena = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                u = new Usuario();
                u.setId(rs.getInt("id"));
                u.setUsuario(rs.getString("usuario"));
                u.setContrasena(rs.getString("contrasena"));
                u.setNombres(rs.getString("nombres"));
            }
        } catch (Exception e) {
        }
        return u;
    }

    public void insertar(Usuario u) {
        try (Connection con = Conexion.getConexion()) {
            String sql = "INSERT INTO usuario(usuario, contrasena, nombres) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, u.getUsuario());
            ps.setString(2, u.getContrasena());
            ps.setString(3, u.getNombres());
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
