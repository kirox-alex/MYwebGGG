package conex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection conectar() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/RopaBD";
        String usuario = "root";
        String clave = "root";
        return DriverManager.getConnection(url, usuario, clave);
    }

    public static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public static Connection getConexion() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
