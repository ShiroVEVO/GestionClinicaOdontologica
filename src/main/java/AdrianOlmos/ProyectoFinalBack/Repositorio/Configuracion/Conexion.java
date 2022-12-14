package AdrianOlmos.ProyectoFinalBack.Repositorio.Configuracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection conn;
    private static final String DRIVER = "org.h2.Driver";
    private static final String URL = "jdbc:h2:~/test";
    private static final String USER = "sa";
    private static final String PASS = "";

    public void conectar() throws SQLException {
        try {
            Class.forName(DRIVER).newInstance();
            conn = DriverManager.getConnection(URL,USER,PASS);
        }catch (Exception e){
            System.out.println("Problema:" + e);
        }
    }
    public void desconectar() throws SQLException {
        if(conn != null){
            if(!conn.isClosed()){
                conn.close();
            }
        }
    }
}
