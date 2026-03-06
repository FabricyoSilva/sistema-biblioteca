package application;

import application.util.ConnectionFactory;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tentando conectar ao banco de dados...");
        try (Connection conexao = ConnectionFactory.getConnection()) {
            if (conexao != null) {
                System.out.println("Sucesso!");
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro na conexao");
            e.printStackTrace();
        }
    }
}
