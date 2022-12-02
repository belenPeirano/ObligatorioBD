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

    public Persona obtenerPersona(int userID) throws SQLException {
        try ( PreparedStatement st = con.prepareStatement("SELECT * FROM PERSONAS WHERE userID = ?")) {
            st.setInt(1, userID);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                return new Persona(
                        rs.getInt("userID"),
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

    public void cambiarContraseña(String contraseña, int ci) throws SQLException {
        try ( PreparedStatement st = con.prepareStatement("UPDATE PERSONAS SET hashpwd = ? WHERE userID = ?")) {
            st.setString(1, contraseña);
            st.setInt(2, ci);
            st.executeUpdate();
        }
    }

    boolean contraseñaEsCorrecta(String text, String aString) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void CrearPersona(String text, String text0, String text1, String text2, String text3, String aString, String txtUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    boolean existePersona(int ci) throws SQLException {
        try (PreparedStatement st = con.prepareStatement("SELECT * FROM PERSONAS WHERE userID = ?")) {
            st.setInt(1, ci);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                return true;
            }
        }
        return false;
    }

}