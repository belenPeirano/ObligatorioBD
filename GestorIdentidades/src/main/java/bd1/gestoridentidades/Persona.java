package bd1.gestoridentidades;

import static bd1.gestoridentidades.Permisos.con;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author belu_
 */
public class Persona {

    public int ci;
    public String nombres;
    public String apellidos; 
    public String direccion; 
    public String ciudad; 
    public String departamento; 
    public String hashpwd;

    public Persona(int ci, String nombres, String apellidos, String direccion, String ciudad, String departamento, String hashpwd) {
        this.nombres = nombres;
        this.ci = ci;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.hashpwd = hashpwd;
    }
    
    public void setHashpwd(String hashpwd) {
        this.hashpwd = hashpwd;
    }

    public String getHashpwd() {
        return hashpwd;
    }
}