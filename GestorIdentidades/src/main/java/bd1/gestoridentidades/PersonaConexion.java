package bd1.gestoridentidades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTextField;

/**
 *
 * @author belu_
 */
public class PersonaConexion {

    static Connection con;

    public PersonaConexion(Connection conexion) {
        this.con = conexion;
    }

    public Persona obtenerPersona(String nombreUs) throws SQLException {
        try ( PreparedStatement st = con.prepareStatement("SELECT * FROM PERSONAS WHERE nombreUsuario = ?")) {
            st.setString(1, nombreUs);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                return new Persona(
                        rs.getString("nombreUsuario"),
                        rs.getString("nombres"),
                        rs.getString("apellidos"),
                        rs.getString("direccion"),
                        rs.getString("ciudad"),
                        rs.getString("departamento"),
                        rs.getString("hashpwd")
                );
            }
        }
        return null;
    }

    public void cambiarContraseña(String contraseña, String usuario) throws SQLException {
        try ( PreparedStatement st = con.prepareStatement("UPDATE PERSONAS SET hashpwd = ? WHERE nombreUsuario = ?")) {
            st.setString(1, contraseña);
            st.setString(2, usuario);
            st.executeUpdate();
        }
    }

    boolean contraseñaEsCorrecta(String text, String aString) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void CrearPersona(String text, String text0, String text1, String text2, String text3, String aString, String txtUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
