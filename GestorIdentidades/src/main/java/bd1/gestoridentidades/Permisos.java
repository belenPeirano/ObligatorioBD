package bd1.gestoridentidades;

import static bd1.gestoridentidades.PersonaConexion.con;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author belu_
 */
public class Permisos {

    static Connection con;

    public Permisos(Connection connection) {
        this.con = connection;
    }

    public static String listarPermisos() throws SQLException {
        String resultado = "";
        try {
            Statement consulta = con.createStatement();
            ResultSet registro = consulta.executeQuery("SELECT * FROM PERMISOS");

            if (registro.next()) {
                String fechaAut = "NULL";
                if (registro.getDate("fechaAutorizacion") != null) {
                    fechaAut = registro.getDate("fechaAutorizacion").toString();
                }
                resultado += registro.getInt("userID") + ", " + registro.getInt("appId") + ", " + registro.getInt("rolNegID") + ", " + registro.getDate("fechaSolicitud").toString() + ", " + fechaAut + ", " + registro.getString("estado") + "\n";
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    public static void nuevaSolicitud(String nombreUs, String rol) throws SQLException {
        System.out.println("gholaaaa");
        try ( PreparedStatement st = con.prepareStatement("SELECT * FROM PERSONAS WHERE nombreUsuario = ?")) {
            st.setString(1, nombreUs);
            ResultSet rs = st.executeQuery();
            int userId = 0;
            while (rs.next()) {
                userId = rs.getInt("userID");
            }
            PreparedStatement stRol = con.prepareStatement("SELECT rolNegID FROM ROLES_NEGOCIO WHERE descRolNeg = ?");
            stRol.setString(1, rol);
            ResultSet rsRol = stRol.executeQuery();

            PreparedStatement st2 = con.prepareStatement("INSERT INTO PERMISOS VALUES (?, ?, ?, CURDATE(), NULL, 'Pendiente')");
            st2.setInt(1, userId);
            st2.setInt(2, 1);
            while (rsRol.next()) {
                st2.setInt(3, rsRol.getInt("rolNegID"));
            }
            
            st2.execute();
                    
        }
    }

}
