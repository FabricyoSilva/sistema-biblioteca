package application.dao;

import application.interfaces.ILivroDao;
import application.interfaces.ILivroDao;
import application.model.Livro;
import application.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LivroDAOImpl implements ILivroDao {

    @Override
    public void salvar(Livro livro) {

        String sql = "INSERT INTO livros (titulo, autor, ano_publicacao, disponivel) VALUES (?, ?, ?, ?)";


        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.setInt(3, livro.getAnoPublicacao());
            stmt.setBoolean(4, livro.isDiponivel());

            stmt.executeUpdate();

            System.out.println("Sucesso: O livro '" + livro.getTitulo() + "' foi salvo no banco de dados!");

        } catch (SQLException e) {
            System.err.println("Erro ao tentar salvar o livro no banco de dados.");
            e.printStackTrace();
        }
    }
    @Override
    public List<Livro> buscarTodos() {
        Stirng sql = "SELECT * FROM livros";

        List<Livro> livros = new ArrayList<>();


        return livros;
    }
}