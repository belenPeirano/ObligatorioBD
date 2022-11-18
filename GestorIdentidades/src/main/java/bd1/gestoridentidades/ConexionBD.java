/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd1.gestoridentidades;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConexionBD {

    Connection con = null;
    String userName = "root";
    String password = "admin";
    String url = "jdbc:mysql://localhost:3304/GestorIdentidades";

    /*public void conectar() {
        try {
            con = DriverManager.getConnection(url, userName, password);
            System.out.println("Conexión realizada");
        } catch (Exception exc) {
            System.out.println("No se pudo establecer la conexión a la base de datos. Error: " + exc);
        }
    }*/

    public Connection obtenerConexion() {
        try {
            return con = DriverManager.getConnection(url, userName, password);
        } catch (Exception exc) {
            System.out.println("No se pudo establecer la conexión a la base de datos");
            return null;
        }
    }
}
