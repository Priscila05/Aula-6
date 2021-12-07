package br.com.tech4me.tech4livros.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.tech4me.tech4livros.model.Livro;

public interface LivroRepository extends MongoRepository<Livro, String> {
    
}
