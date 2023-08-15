package dao;

import java.sql.Connection;
import java.sql.Statement;
import models.ClienteBean;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ClienteDao {

    private Connection conn;
    
    public ClienteDao() {
        this.conn = Conexion.getConnection();
    }

    public ArrayList<ClienteBean> mostrarCliente() {
        ClienteBean cli = null;
        ArrayList<ClienteBean> listado = new ArrayList<ClienteBean>();
        try {
            String query = ("select * from listaproductos");
            Statement stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if(rs.next()){
                rs.beforeFirst();
                while (rs.next()){
                    cli = new ClienteBean();
                    cli.setIdProducto(rs.getInt(1));
                    cli.setImg(rs.getString(2));
                    cli.setNombre(rs.getString(3));
                    cli.setDesc(rs.getString(4));
                    cli.setValor(rs.getInt(5));
                    listado.add(cli);
                } 
            }else{
                System.out.println("Error al consultar los datos del cliente...");
            }
        }catch(SQLException ex)
        {
            System.out.println("Error al consultar los datos del cliente" + ex.getMessage());
        }
        return listado;
    }
}
