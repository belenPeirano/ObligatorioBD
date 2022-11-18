/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd1.gestoridentidades;

import java.sql.Connection;
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
}