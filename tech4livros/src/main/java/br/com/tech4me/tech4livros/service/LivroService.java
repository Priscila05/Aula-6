package br.com.tech4me.tech4livros.service;

import java.util.List;
import br.com.tech4me.tech4livros.model.Livro;

public interface LivroService {
    List<Livro> obterLivros();

    Livro obterLivroPorId(String id);

    Livro cadastrarLivro(Livro livro);

    Livro atualizarLivro(String id, Livro novoLivro);
    
    void excluirLivro(String id);
}
