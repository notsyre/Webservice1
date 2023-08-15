package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static Connection conn = null;
    private String driver;
    private String url;
    private String usuario;
    private String password;

    private Conexion() {
        this.url = "jdbc:mysql://localhost:3306/productos";
        this.driver = "com.mysql.jdbc.Driver";
        this.usuario = "root";
        this.password = "";
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, usuario, password);
        }
        catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        if(conn == null){
            new Conexion();
        }
        return conn;
    }
}
