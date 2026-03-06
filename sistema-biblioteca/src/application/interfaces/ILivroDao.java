package application.interfaces;

import application.model.Livro;

import java.util.List;

public interface ILivroDao {
    void salvar(Livro livro); //Permirte existir função salvar no banco de dados

    List<Livro> buscarTodos();
}
