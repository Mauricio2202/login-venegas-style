
package venegasstyle;

/*import com.sun.jdi.connect.spi.Connection;
import venegasstyle.modelo.ConexionDB;*/
import venegasstyle.vista.LoginForm;

public class VenegasStyle {

    public static void main(String[] args) {
        /*ConexionDB conexionDB = new ConexionDB();
        Connection conexion = conexionDB.getConnection();

        if (conexion != null) {
            System.out.println("La conexión fue establecida correctamente.");
        } else {
            System.out.println("No se pudo establecer la conexión.");
        }*/
        
        java.awt.EventQueue.invokeLater(() -> {
            new LoginForm().setVisible(true);
        });
    }
    
}
