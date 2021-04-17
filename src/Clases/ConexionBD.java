/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author luisd
 */
public class ConexionBD {
    public static String url = "jdbc:mysql://localhost/nombredelabasededatos";
    public static String usuario = "root";
    public static String contrasenia = "root";
    public static String clase = "com.mysql.jdbc.Driver";
    
    public static Connection conectar(){
        Connection conexion = null;

try{
    Class.forName(clase);
    conexion = (Connection) DriverManager.getConnection(url,usuario,contrasenia);
    System.out.println("Conexion establecida");
}catch (ClassNotFoundException | SQLException e){
    System.out.println("¡Error!..." + e);
}

return conexion;
}   
}
