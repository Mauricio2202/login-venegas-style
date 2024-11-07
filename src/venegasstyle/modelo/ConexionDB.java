
package venegasstyle.modelo;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionDB {
    
    private static final String URL = "jdbc:mysql://localhost:3306/venegas_style";
    private static final String USER = "root";
    private static final String PASSWORD = "220204";
    
    public Connection getConnection() {
        Connection conexion = null;
        try {
            conexion = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos");
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        return conexion;
    }
    
}
