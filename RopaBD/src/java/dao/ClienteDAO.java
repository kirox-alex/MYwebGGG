package dao;

import conex.Conexion;
import modelo.Cliente;
import java.sql.*;
import java.util.*;

public class ClienteDAO {
    public List<Cliente> listarClientes() {
        List<Cliente> lista = new ArrayList<>();
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM clientes");
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getInt("id_cliente"));
                c.setNombres(rs.getString("nombres_completos"));
                lista.add(c);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public void registrar(Cliente c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Cliente> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
