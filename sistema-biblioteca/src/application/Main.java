package application;

import application.dao.LivroDAOImpl;
import application.interfaces.ILivroDao;
import application.model.Livro;
import application.util.ConnectionFactory;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Livro livroAleatorio = new Livro();
        livroAleatorio.setTitulo("Senhor dos Aneis");
        livroAleatorio.setAutor("Fabricyo Silva");
        livroAleatorio.setAnoPublicacao(1960);
        livroAleatorio.setDiponivel(true);

        ILivroDao livroDao = new LivroDAOImpl();

        System.out.println("Enviando os dados...");
        livroDao.salvar(livroAleatorio);
    }
}
