package dao;

import conex.Conexion;
import java.sql.*;
import java.util.*;
import modelo.Publicidad;
import modelo.EnvioPublicidad;

public class PublicidadDAO {
    public void registrar(Publicidad p) {
        String sql = "INSERT INTO publicidad (tipo_producto, descripcion, numero_contacto, imagen_url) VALUES (?, ?, ?, ?)";
        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, p.getTipoProducto());
            ps.setString(2, p.getDescripcion());
            ps.setString(3, p.getNumeroContacto());
            ps.setString(4, p.getImagenUrl());
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public List<Publicidad> listar() {
        List<Publicidad> lista = new ArrayList<>();
        String sql = "SELECT * FROM publicidad";
        try (Connection con = Conexion.getConexion();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                Publicidad p = new Publicidad();
                p.setId(rs.getInt("id_publicidad"));
                p.setTipoProducto(rs.getString("tipo_producto"));
                p.setDescripcion(rs.getString("descripcion"));
                p.setNumeroContacto(rs.getString("numero_contacto"));
                p.setImagenUrl(rs.getString("imagen_url"));
                lista.add(p);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public void asignarPublicidad(EnvioPublicidad e) {
        String sql = "INSERT INTO envios_publicidad (id_cliente, id_publicidad, medio, fecha_envio) VALUES (?, ?, ?, ?)";
        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, e.getIdCliente());
            ps.setInt(2, e.getIdPublicidad());
            ps.setString(3, e.getMedio());
            ps.setTimestamp(4, e.getFechaEnvio());
            ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

