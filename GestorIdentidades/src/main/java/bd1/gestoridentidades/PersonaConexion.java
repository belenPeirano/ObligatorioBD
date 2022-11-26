package bd1.gestoridentidades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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

}