package bd1.gestoridentidades;

import static bd1.gestoridentidades.PersonaConexion.con;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author belu_
 */
public class Pregunta {

    static Connection con;

    public Pregunta(Connection con) {
        this.con = con;
    }

    public String obtenerPregunta(int ci) throws SQLException {
        try ( PreparedStatement st2 = con.prepareStatement("select pregunta from PREGUNTAS join PERSONAS_PREGUNTAS on PREGUNTAS.pregID = PERSONAS_PREGUNTAS.pregID join PERSONAS on PERSONAS.userID = PERSONAS_PREGUNTAS.userID WHERE PERSONAS.userID = ?")) {
            System.out.println("hola");
            st2.setInt(1, ci);
            ResultSet rs2 = st2.executeQuery();
            while (rs2.next()) {
                return rs2.getString("pregunta");
            }
        }
        return null;
    }

    public boolean respuestaCorrecta(int ci, String respuesta) throws SQLException {
        try (PreparedStatement st2 = con.prepareStatement("select respuesta from PREGUNTAS join PERSONAS_PREGUNTAS on PREGUNTAS.pregID = PERSONAS_PREGUNTAS.pregID join PERSONAS on PERSONAS.userID = PERSONAS_PREGUNTAS.userID WHERE PERSONAS.userID = ?")) {
            st2.setInt(1, ci);
            ResultSet rs2 = st2.executeQuery();
            while (rs2.next()) {
                if (rs2.getString("respuesta").equals(respuesta)) {
                    return true;
                }
            }
        }
        return false;
    }

    void NuevaPregunta(String usuario, String pregunta, String respuesta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
