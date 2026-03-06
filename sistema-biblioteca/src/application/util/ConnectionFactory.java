package application.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String URL ="jdbc:mysql://localhost:3306/sistema_biblioteca?allowPublicKeyRetrieval=true&useSSL=false";
    private static final String USER = "root";
    private  static final String PASSWORD = "senha123";


    public static Connection getConnection () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }
        catch (ClassNotFoundException e){
            throw new RuntimeException("Driver do banco de dados não encontrado", e);
        }
        catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar com banco de dados" + e.getMessage(), e);
        }
    }
}
